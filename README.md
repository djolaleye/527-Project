# 527-Project
## Project Overview

Software reliability is a critical concern in modern systems, where undetected faults can lead to failures and financial loss. Mutation testing is a powerful technique for evaluating test suite effectiveness by introducing artificial faults (mutants). However, traditional mutation testing suffers from high computational cost and scalability challenges, limiting its practicality.

This project explores a hybrid mutation testing framework that combines:

Learning-based mutation models (LEAM)
Least-Attention based LLM mutation generation (BugFarm)

The goal is to generate more comprehensive and diverse mutants while improving efficiency and scalability.


## Setup Instructions
1. Clone the Repository

    `git clone https://github.com/djolaleye/527-Project.git`

    `cd 527-Project`

2. Download Required Datasets and Models

    Download the mutant datasets (sweagent, BugFarm [data], LEAM [results]) and trained LEAM model from:

    https://drive.google.com/drive/folders/1JmGOXkmIJhWU1sV_YV_UD7DUXFLye3Nc?usp=sharing

    Place the downloaded contents into the appropriate directories (mutants/, model/checkpointSearch).

3. Build and Run Docker Container

    Build the Docker image:

    `docker build -t bl_cntr .`

    Run the container:

    `docker run --rm -it bl_cntr bash`

4. To use mini-swe-agent, first run `mini-extra config setup`

NOTE: run PIT with "-Danimal.sniffer.skip=true"