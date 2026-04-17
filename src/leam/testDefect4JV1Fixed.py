import sys
import os
import json
import pickle
import javalang
import torch
import numpy as np

# ── Locate repo root and add model/ to sys.path ───────────────────────────
APP_DIR = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
MODEL_DIR = os.path.join(APP_DIR, 'model')
if MODEL_DIR not in sys.path:
    sys.path.insert(0, MODEL_DIR)

from Model import Decoder
from Searchnode import Node as SNode      # tree node (model/Searchnode.py)
from stringfycode import stringfyRoot


# ── dotdict ───────────────────────────────────────────────────────────────
class dotdict(dict):
    def __getattr__(self, name):
        return self[name]


# ── low-level helpers ─────────────────────────────────────────────────────
def _pad(seq, n, fill=0):
    seq = list(seq)
    return (seq + [fill] * n)[:n]


def _pad2d(seq, n1, n2, fill=0):
    seq = [_pad(row, n2, fill) for row in seq]
    return (seq + [[fill] * n2] * n1)[:n1]


def _get_em(words, voc):
    return [voc.get(w.lower(), 1) for w in words]


def _get_char_em(words, char_voc):
    return [[char_voc.get(c, 1) for c in w.lower()] for w in words]


def _anti_mask(size):
    ans = np.zeros([size, size], dtype=np.float32)
    for i in range(size):
        ans[i, :i + 1] = 1.0
    return ans


def _t(data, device):
    if isinstance(data, np.ndarray):
        return torch.from_numpy(data).to(device)
    return data.to(device)


# ── load vocabulary from model/data/*.pkl ────────────────────────────────
def _load_vocab(model_dir):
    data_dir = os.path.join(model_dir, 'data')
    required = ['rule4.pkl', 'rulead.pkl', 'nl_voc.pkl', 'code_voc.pkl', 'char_voc.pkl']
    for fname in required:
        path = os.path.join(data_dir, fname)
        if not os.path.exists(path):
            raise FileNotFoundError(
                f"LEAM vocabulary file not found: {path}\n"
                "These files must be generated from LEAM training data "
                "and placed in model/data/ before running this script."
            )

    ruledict = pickle.load(open(os.path.join(data_dir, 'rule4.pkl'), 'rb'))
    ruledict['start -> copyword2'] = len(ruledict)
    ruledict['start -> copyword3'] = len(ruledict)
    rrdict = {v: k for k, v in ruledict.items()}   # index -> rule string

    rulead = pickle.load(open(os.path.join(data_dir, 'rulead.pkl'), 'rb'))  # (cnum, cnum)

    code_voc = pickle.load(open(os.path.join(data_dir, 'code_voc.pkl'), 'rb'))
    code_voc['sta'] = len(code_voc)
    code_voc['<emptynode>'] = len(code_voc)

    char_voc = pickle.load(open(os.path.join(data_dir, 'char_voc.pkl'), 'rb'))

    return ruledict, rrdict, rulead, code_voc, char_voc


# ── download + initialise the LEAM Decoder ───────────────────────────────
def load_leam_model(device):
    ruledict, rrdict, rulead, code_voc, char_voc = _load_vocab(MODEL_DIR)
    nl_len = 500

    args = dotdict({
        'NlLen': nl_len, 'CodeLen': 60, 'batch_size': 1,
        'embedding_size': 256, 'WoLen': 15,
        'Vocsize':       len(char_voc),
        'Nl_Vocsize':    len(code_voc),
        'Code_Vocsize':  len(code_voc),
        'max_step': 3, 'margin': 0.5, 'poolsize': 50, 'num_steps': 50,
        'rulenum': len(ruledict) + nl_len,
        'cnum':    len(rulead),
    })

    ckpt_path = os.path.join(MODEL_DIR, "checkpointSearch", "best_model.ckpt")
    if not os.path.exists(ckpt_path):
        raise FileNotFoundError(
            f"LEAM checkpoint not found: {ckpt_path}\n"
            "Place best_model.ckpt at model/checkpointSearch/best_model.ckpt"
        )
    print(f"Loading checkpoint from {ckpt_path}")

    model = Decoder(args)
    state_dict = torch.load(ckpt_path, map_location=device)
    # Strip nn.DataParallel 'module.' prefix if the checkpoint was saved with it
    if any(k.startswith('module.') for k in state_dict):
        state_dict = {k[len('module.'):]: v for k, v in state_dict.items()}
    model.load_state_dict(state_dict)
    model.to(device).eval()

    return model, ruledict, rrdict, rulead, code_voc, char_voc, args


# ── Java source → LEAM linearised tree tokens ────────────────────────────
_SKIP_ATTRS = frozenset(['position', 'documentation', 'annotations', 'modifiers'])


def _serialise_node(node, out):
    out.append(type(node).__name__)
    for attr in node.attrs:
        if attr in _SKIP_ATTRS:
            continue
        val = getattr(node, attr, None)
        if val is None:
            continue
        if isinstance(val, (str, bool, int, float)):
            out += [attr, str(val) + '_ter', '^', '^']
        elif isinstance(val, (list, set, frozenset)):
            items = [v for v in val if v is not None]
            if not items:
                continue
            out.append(attr)
            for item in items:
                if isinstance(item, javalang.tree.Node):
                    _serialise_node(item, out)
                elif isinstance(item, str):
                    out += [item + '_ter', '^']
            out.append('^')
        elif isinstance(val, javalang.tree.Node):
            out.append(attr)
            _serialise_node(val, out)
            out.append('^')
    out.append('^')


def _java_to_leam_tokens(java_src):
    """Parse a Java method string and return LEAM-format linearised tree tokens."""
    wrapped = f"class _T {{ {java_src} }}"
    try:
        tree = javalang.parse.parse(wrapped)
        for _, node in tree.filter(javalang.tree.MethodDeclaration):
            tokens = ['root']
            _serialise_node(node, tokens)
            return tokens
    except Exception:
        pass
    # Fallback for unparseable input
    return ['root', 'StatementExpression_ter', '^', '^']


# ── build input tensors for one NL sample ────────────────────────────────
def _build_nl_tensors(nl_tokens, code_voc, char_voc, nl_len, wo_len):
    """
    Mirror Dataset.preProcessOne for a single Java-method NL input.
    Returns (inputnl_ids, nlad, inputpos, inputnlchar, nodes, root_node).
    """
    inputnl_ids = _pad(_get_em(nl_tokens, code_voc), nl_len)

    # Rebuild tree from token list to compute adjacency and depth
    root_node = SNode('root', 0)
    nodes = [root_node]
    curr = root_node
    idx = 1
    for tok in nl_tokens[1:]:
        if tok != '^':
            nd = SNode(tok, idx)
            nd.father = curr
            curr.child.append(nd)
            nodes.append(nd)
            curr = nd
            idx += 1
        else:
            if curr.father is not None:
                curr = curr.father

    # Adjacency (parent-child + sibling edges, matching preProcessOne)
    rows, cols = [], []
    for nd in nodes:
        if nd.father and nd.id < nl_len and nd.father.id < nl_len:
            rows.append(nd.id); cols.append(nd.father.id)
        if nd.father:
            for sib in nd.father.child:
                if nd.id < nl_len and sib.id < nl_len:
                    rows.append(nd.id); cols.append(sib.id)
        for ch in nd.child:
            if nd.id < nl_len and ch.id < nl_len:
                rows.append(nd.id); cols.append(ch.id)
    nlad = np.zeros((nl_len, nl_len), dtype=np.float32)
    for r, c in zip(rows, cols):
        nlad[r, c] = 1.0

    # inputPos: depth of each node
    depth = np.zeros(nl_len, dtype=np.int64)
    def _fill(nd, d):
        if nd.id < nl_len:
            depth[nd.id] = d
        for ch in nd.child:
            _fill(ch, d + 1)
    _fill(root_node, 1)

    # Char embeddings for NL tokens (inputNlChar)
    char_rows = [_pad(c, wo_len) for c in _get_char_em(nl_tokens, char_voc)]
    inputnlchar = np.array(_pad2d(char_rows, nl_len, wo_len), dtype=np.int64)

    return (np.array(inputnl_ids, dtype=np.int64),
            nlad,
            depth,
            inputnlchar,
            nodes,
            root_node)


# ── precomputed grammar / rule tensors (mirrors run.py helpers) ───────────
def _build_shared_tensors(ruledict, rrdict, rulead, code_voc, char_voc, args, device):
    cnum   = args.cnum
    wo_len = args.WoLen

    # getRulePkl: parent token ID and child code-vocab IDs per grammar rule
    # (mirrors run.py:getRulePkl — tmpc holds code-vocab IDs, not char IDs)
    par_ids, child_ids = [], []
    for i in range(cnum):
        rule_str = rrdict.get(i, 'root -> unknown')
        parts = rule_str.strip().lower().split()
        par_ids.append(code_voc.get(parts[0], 1))
        child_toks = parts[2:] if len(parts) > 2 else ['unknown']
        child_ids.append(_pad(_get_em(child_toks, code_voc), wo_len))

    tmpf = _t(np.array(par_ids,  dtype=np.int64), device).unsqueeze(0).repeat(2, 1)
    tmpc = _t(np.array(child_ids, dtype=np.int64), device).unsqueeze(0).repeat(2, 1, 1)

    # getAstPkl: char embedding per code-vocab token
    rvoc = {v: k for k, v in code_voc.items()}
    ast_chars = [_pad(_get_char_em([rvoc.get(i, 'unknown').strip().lower()], char_voc)[0], wo_len)
                 for i in range(len(code_voc))]
    tmpchar = _t(np.array(ast_chars, dtype=np.int64), device).unsqueeze(0).repeat(2, 1, 1)

    tmpindex  = _t(np.arange(len(ruledict), dtype=np.int64), device).unsqueeze(0).repeat(2, 1)
    tmpindex2 = _t(np.arange(len(code_voc),  dtype=np.int64), device).unsqueeze(0).repeat(2, 1)
    rulead_t  = _t(np.array(rulead, dtype=np.float32),       device).unsqueeze(0).repeat(2, 1, 1)
    antimask  = _t(_anti_mask(args.CodeLen), device)

    return tmpf, tmpc, tmpchar, tmpindex, tmpindex2, rulead_t, antimask


# ── minimal dataset proxy expected by SearchNode ─────────────────────────
class _VocabProxy:
    def __init__(self, ruledict, rrdict, code_voc, char_voc, nl_tokens, args):
        self.ruledict = ruledict
        self.rrdict   = rrdict
        self.Code_Voc = code_voc
        self.Nl_Voc   = code_voc
        self.Char_Voc = char_voc
        self.Char_Len = args.WoLen
        self.Code_Len = args.CodeLen
        self.Nl_Len   = args.NlLen
        self.nl       = [nl_tokens]   # single-item "dataset"

    def Get_Em(self, words, voc):
        return _get_em(words, voc)

    def Get_Char_Em(self, words):
        return _get_char_em(words, self.Char_Voc)

    def pad_seq(self, seq, n):
        return _pad(seq, n)

    def pad_list(self, seq, n1, n2):
        return _pad2d(seq, n1, n2)


# ── beam search (mirrors run.py:BeamSearch for a single sample) ───────────
# Import SearchNode from run.py; its checkapply uses run.py's module-level
# args (NlLen=500, CodeLen=60) which match our setup.
from run import SearchNode

def _beam_search(inputnl_tensors, vds, model,
                 tmpf, tmpc, tmpchar, tmpindex, tmpindex2, rulead_t, antimask,
                 args, device, beamsize=5):
    """
    Grammar-guided beam search for a single Java sample.
    inputnl_tensors: (inputnl, nlad, depth, nlchar) – 1D/2D numpy arrays for 1 sample.
    Returns list of finished SearchNode objects sorted by probability (highest first).
    """
    nl_ids, nlad, depth, nlchar = inputnl_tensors

    # Expand to batch dim=1 for the model call
    b_nl    = _t(nl_ids[None],  device).long()    # (1, NlLen)
    b_nlad  = _t(nlad[None],    device).float()   # (1, NlLen, NlLen)
    b_depth = _t(depth[None],   device).long()    # (1, NlLen)
    b_nlch  = _t(nlchar[None],  device).long()    # (1, NlLen, WoLen)

    code_len = args.CodeLen
    nl_len   = args.NlLen

    beams    = [SearchNode(vds, vds.nl[0])]
    his_tree = {}
    tans     = []
    end_num  = 0

    with torch.no_grad():
        for step in range(code_len):
            if end_num >= beamsize:
                break

            tmp_beam   = []
            ans_v      = []
            valid_idxs = []
            tmprule, tmprulechild, tmpruleparent = [], [], []
            tmptreepath, tmpAd, tmpdepth         = [], [], []

            for p, x in enumerate(beams):
                x.selectExpandedNode()
                if x.expanded is None or len(x.state) >= code_len:
                    x.finish = True
                    ans_v.append(x)
                else:
                    valid_idxs.append(p)
                    a, b_r, c, d = x.getRuleEmbedding(vds, vds.nl[0])
                    tmprule.append(a)
                    tmprulechild.append(b_r)
                    tmpruleparent.append(c)
                    tmptreepath.append(x.getTreePath(vds))
                    tmpAd.append(x.parent)
                    tmpdepth.append(d)

            tans.extend(ans_v)
            end_num += len(ans_v)

            if not tmprule:
                continue

            n = len(tmprule)
            am = antimask.unsqueeze(0).repeat(n, 1, 1).unsqueeze(1)

            # Repeat NL inputs for each active beam hypothesis
            b_nl_r    = b_nl.repeat(n, 1)
            b_nlad_r  = b_nlad.repeat(n, 1, 1)
            b_depth_r = b_depth.repeat(n, 1)
            b_nlch_r  = b_nlch.repeat(n, 1, 1)

            result = model(
                b_nl_r,
                b_nlad_r,
                _t(np.array(tmprule,       dtype=np.int64),   device).long(),
                _t(np.array(tmpruleparent, dtype=np.int64),   device).long(),
                _t(np.array(tmprulechild,  dtype=np.int64),   device).long(),
                _t(np.array(tmpAd,         dtype=np.float32), device).float(),
                _t(np.array(tmptreepath,   dtype=np.int64),   device).long(),
                b_depth_r,
                b_nlch_r,
                tmpf, tmpc, tmpindex, tmpchar, tmpindex2, rulead_t, am,
                None, "test"
            )
            results = result.data.cpu().numpy()   # (n, code_len, vocab)

            for j, p in enumerate(valid_idxs):
                x      = beams[p]
                scores = results[j, step]          # (vocab_size,)
                # Sort descending by probability; try top candidates
                order  = np.argsort(-scores)
                added  = 0
                for rule_idx in order:
                    if added >= 30:
                        break
                    if scores[rule_idx] == 0:
                        break
                    if not x.checkapply(int(rule_idx), vds):
                        continue
                    prob = x.prob + np.log(scores[rule_idx] + 1e-12)
                    tmp_beam.append((prob, int(rule_idx), x))
                    added += 1

            # Keep top-beamsize hypotheses
            tmp_beam.sort(key=lambda t: t[0], reverse=True)
            new_beams = []
            seen = {}
            for (prob, rule_idx, x) in tmp_beam:
                if len(new_beams) >= beamsize:
                    break
                cx = pickle.loads(pickle.dumps(x))
                cx.applyrule(rule_idx, vds)
                ts = cx.getTreestr()
                if ts in seen:
                    continue
                seen[ts] = 1
                cx.prob = prob
                new_beams.append(cx)
            beams = new_beams if new_beams else beams

    tans.extend(beams)
    finished = [x for x in tans if x.finish]
    if not finished:
        finished = tans
    finished.sort(key=lambda x: x.prob, reverse=True)
    return finished[:beamsize]


# ── main generation function ──────────────────────────────────────────────
def generate_mutants(idxInput, model, vocab, device):
    ruledict, rrdict, rulead, code_voc, char_voc, args = (
        vocab['ruledict'], vocab['rrdict'], vocab['rulead'],
        vocab['code_voc'], vocab['char_voc'], vocab['args']
    )

    project_name, sample_idx = idxInput.split('_')
    input_file = f"src/leam/location2/{project_name}/{sample_idx}/parsed_ochiai_result"
    output_dir = "src/leam/mutants"
    os.makedirs(output_dir, exist_ok=True)

    if not os.path.exists(input_file):
        print(f"Error: Input file {input_file} not found.")
        return

    with open(input_file, 'r') as f:
        line_data = f.readline().strip().split('\t')
        target_info = line_data[0]
        filepath    = line_data[2].strip()
        target_line = int(target_info.split('#')[1])

    with open(filepath, 'r', errors='ignore') as f:
        source_code = f.read()
        lines = source_code.splitlines()

    try:
        javalang.parse.parse(source_code)
    except Exception as e:
        print(f"Parsing error: {e}")
        return

    # Extract ~10-line context around target as the "method" for the model
    ctx_start = max(0, target_line - 5)
    ctx_end   = min(len(lines), target_line + 5)
    method_ctx = "\n".join(lines[ctx_start:ctx_end])

    # Convert to LEAM tree tokens and build input tensors
    nl_tokens = _java_to_leam_tokens(method_ctx)
    nl_ids, nlad, depth, nlchar, _, _ = _build_nl_tensors(
        nl_tokens, code_voc, char_voc, args.NlLen, args.WoLen
    )

    # Build shared grammar tensors (cached once per run in practice)
    tmpf, tmpc, tmpchar, tmpindex, tmpindex2, rulead_t, antimask = \
        _build_shared_tensors(ruledict, rrdict, rulead, code_voc, char_voc, args, device)

    vds = _VocabProxy(ruledict, rrdict, code_voc, char_voc, nl_tokens, args)

    results = _beam_search(
        (nl_ids, nlad, depth, nlchar), vds, model,
        tmpf, tmpc, tmpchar, tmpindex, tmpindex2, rulead_t, antimask,
        args, device, beamsize=5
    )

    mutants_list = []
    for i, node in enumerate(results):
        try:
            mutated_line = stringfyRoot(node.root, 0, 0).strip()
        except Exception:
            mutated_line = lines[target_line - 1]

        mutants_list.append({
            "idss":      f"{idxInput}_{i}",
            "filename":  filepath,
            "line":      target_line,
            "prob":      float(np.exp(node.prob)) if node.prob < 0 else 0.0,
            "precode":   "\n".join(lines[:target_line - 1]) + "\n",
            "oldcode":   lines[target_line - 1],
            "aftercode": "\n" + "\n".join(lines[target_line:]),
            "code":      mutated_line,
        })

    save_path = os.path.join(output_dir, f"mutants_{idxInput}.json")
    with open(save_path, 'w') as f:
        json.dump(mutants_list, f)

    print(f"Generated {len(mutants_list)} mutants for {idxInput}")


# ── entry point ───────────────────────────────────────────────────────────
if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 testDefect4jV1Fixed.py <idxInput>")
        sys.exit(1)

    idx = sys.argv[1]

    device = torch.device("cuda" if torch.cuda.is_available() else "cpu")

    print(f"Loading LEAM model …")
    model, ruledict, rrdict, rulead, code_voc, char_voc, args = load_leam_model(device)

    vocab = {
        'ruledict': ruledict, 'rrdict': rrdict, 'rulead': rulead,
        'code_voc': code_voc, 'char_voc': char_voc, 'args': args,
    }

    generate_mutants(idx, model, vocab, device)
