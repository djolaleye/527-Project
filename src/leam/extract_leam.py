import json
import jsonlines
from json import loads
import os
import sys
import utils


def get_files(dir, saveTo, jsonline_file, projects):
    file_sets = {}

    if not os.path.exists(saveTo):
        os.mkdir(saveTo)

    for dirpath, _, files in os.walk(dir):
        for file in files:
            if file.endswith("_all.jsonl"):
                file_path = os.path.join(dirpath, file)
                project_name = os.path.basename(dirpath)
                for project in projects:
                    if project in file and project_name == project:
                        if project not in file_sets:
                            file_sets[project] = []
                        file_sets[project].append(file_path)

    generate_files(file_sets, saveTo, jsonline_file)


def generate_files(file_sets, saveTo, jsonline_file):
    all_final = []
    for project in file_sets:
        final = []
        data = []
        for file_path in file_sets[project]:
            with open(file_path, "r") as jl:
                for each in [loads(each_line) for each_line in jl]:
                    data.append(each)
                    all_final.append(each)

        save_path = os.path.join(saveTo, project + "_final_all.jsonl")
        open(save_path, "w").close()

        idx = 0
        for line in data:
            line["idx"] = idx
            idx += 1
            final.append(line)

        with jsonlines.open(save_path, "a") as jlf:
            for each in final:
                jlf.write_all([each])

        print(save_path, len(final))

    open(jsonline_file, "w").close()
    id = 0
    with jsonlines.open(jsonline_file, "a") as jlfa:
        for each in all_final:
            each["idx"] = id
            id += 1
            jlfa.write_all([each])
    print(jsonline_file, len(all_final))


if __name__ == "__main__":
    args = sys.argv[1:]
    input_jsons_dir = args[0]
    saveto_dir = args[1]
    jsonline_file = args[2]
    projects_dir = args[3] if len(args) > 3 else "/app/projects"
    projects = utils.discover_projects(projects_dir)
    get_files(input_jsons_dir, saveto_dir, jsonline_file, projects)
