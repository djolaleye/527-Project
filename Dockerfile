FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
        software-properties-common \
        build-essential \
        wget curl git \
        subversion \
        ant \
        dos2unix \
        unzip \
        perl cpanminus \
        python3 python3-dev python3-pip \
        openjdk-8-jdk \
        openjdk-11-jdk \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

RUN cpanm --notest String::Interpolate

# ── 2. Maven 3.6.3 ───────────────────────────────────────────────────────────
RUN wget -q https://archive.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz -P /tmp \
    && tar xf /tmp/apache-maven-3.6.3-bin.tar.gz -C /opt \
    && ln -s /opt/apache-maven-3.6.3 /opt/maven \
    && rm /tmp/apache-maven-3.6.3-bin.tar.gz

ENV M2_HOME=/opt/maven \
    MAVEN_HOME=/opt/maven \
    PATH=/opt/maven/bin:${PATH}

# ── 3. Java version management ───────────────────────────────────────────────
RUN update-alternatives --install /usr/bin/java  java  /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java  1080 \
    && update-alternatives --install /usr/bin/java  java  /usr/lib/jvm/java-11-openjdk-amd64/bin/java    1100 \
    && update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-8-openjdk-amd64/bin/javac    1080 \
    && update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-11-openjdk-amd64/bin/javac   1100 \
    && update-alternatives --set java  /usr/lib/jvm/java-11-openjdk-amd64/bin/java \
    && update-alternatives --set javac /usr/lib/jvm/java-11-openjdk-amd64/bin/javac

ENV JAVA_8_HOME=/usr/lib/jvm/java-8-openjdk-amd64 \
    JAVA_11_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
    JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64

# Helper scripts to switch Java versions inside build scripts
RUN printf '#!/bin/bash\nupdate-alternatives --set java  "$JAVA_8_HOME/jre/bin/java"\nupdate-alternatives --set javac "$JAVA_8_HOME/bin/javac"\nexport JAVA_HOME=$JAVA_8_HOME\n'  > /usr/local/bin/use_java8  \
    && printf '#!/bin/bash\nupdate-alternatives --set java  "$JAVA_11_HOME/bin/java"\nupdate-alternatives --set javac "$JAVA_11_HOME/bin/javac"\nexport JAVA_HOME=$JAVA_11_HOME\n' > /usr/local/bin/use_java11 \
    && chmod +x /usr/local/bin/use_java8 /usr/local/bin/use_java11

# ── 4. Defects4J ─────────────────────────────────────────────────────────────
# Perl modules required by defects4j's init.sh / framework scripts
RUN cpanm --quiet --notest \
        Archive::Tar \
        DBI \
        DBD::CSV \
        XML::Simple \
        XML::Parser \
        Storable

RUN git clone --depth 1 https://github.com/rjust/defects4j.git /opt/defects4j \
    && cd /opt/defects4j && ./init.sh

ENV D4J_HOME=/opt/defects4j 
ENV PATH="/opt/defects4j/framework/bin:${PATH}"

# ── 5. BugsInPy (from local repo) ────────────────────────────────────────────
# Copy the framework AND the projects metadata database
COPY bugsinpy-repo/framework /opt/bugsinpy/framework
COPY bugsinpy-repo/projects /opt/bugsinpy/projects

# Normalise line-endings and mark executable (handles Windows-checked-out repos)
RUN find /opt/bugsinpy/framework/bin -type f -exec dos2unix {} \; \
    && chmod +x /opt/bugsinpy/framework/bin/*

ENV BUGSINPY_HOME=/opt/bugsinpy 
ENV PATH="$BUGSINPY_HOME/framework/bin:$PATH"

# ── 6. Python dependencies ────────────────────────────────────────────────────
WORKDIR /app

# requirements.txt first — changes rarely, good cache layer
COPY requirements.txt .
RUN pip3 install --no-cache-dir -r requirements.txt

# BugFarm / attention analysis packages
RUN pip3 install --no-cache-dir \
        ansi==0.3.6 \
        matplotlib==3.3.4 \
        nltk==3.6.7 \
        numpy==1.21.6 \
        seaborn==0.12.2 \
        "torch==1.12.1" \
        "transformers==4.22.2" \
        wordninja==2.0.0

# javalang fork with position info (required by method_extractor.py)
RUN pip3 install --no-cache-dir \
        git+https://github.com/jose/javalang.git@start_position_and_end_position

# source-code-tokenizer (required by bugfarm utils)
RUN apt-get update && apt-get install -y npm \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

RUN git clone --depth 1 https://github.com/devreplay/source-code-tokenizer.git /opt/source-code-tokenizer \
    && cd /opt/source-code-tokenizer \
    && npm install \
    && npm link

# ── 7. Application source ─────────────────────────────────────────────────────
COPY . /app

RUN mkdir -p /app/projects /app/logs /app/data \
    && find /app/scripts -name "*.sh" -exec chmod +x {} \; \
    && chmod +x /app/setup.sh

# ── 8. Entrypoint ─────────────────────────────────────────────────────────────
RUN cat > /app/docker-entrypoint.sh <<'EOF'
#!/usr/bin/env bash
set -e

echo "=== Environment check ==="
mvn --version
echo "Java 8:";  "$JAVA_8_HOME/bin/java"  -version 2>&1
echo "Java 11:"; "$JAVA_11_HOME/bin/java" -version 2>&1
command -v defects4j >/dev/null && echo "defects4j OK" || echo "defects4j not found on PATH"
bugsinpy-checkout --help &>/dev/null && echo "bugsinpy-checkout OK" || echo "bugsinpy-checkout not found on PATH"

# Checkout benchmark projects on first run
if [ ! -d /app/projects/commons-cli ]; then
  echo "=== Checking out benchmark projects ==="
  bash /app/scripts/checkout_projects.sh --root /app
fi

exec "$@"
EOF
RUN chmod +x /app/docker-entrypoint.sh

ENTRYPOINT ["/app/docker-entrypoint.sh"]
CMD ["/bin/bash"]
