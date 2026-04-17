import csv
import glob
import jsonlines
import json
import math
import os
import sys
import random
import utils
from typing import Set, Tuple
from pathlib import Path

# numbers of methods to sample for each Defects4J project.
# projects not listed (BugsInPy entries) will use DEFAULT_SAMPLE_COUNT.
projects_method = {
    "commons-cli": 30,
    "commons-csv": 41,
    }

DEFAULT_SAMPLE_COUNT = 30

# generate input parsed_ochiai_result files for each project,
# input: project name, main_dir (repo/app root)
# output: `parsed_ochiai_result` files in dir `location2/project_name`,
def get_files(project_name, main_dir):
    java_glob = os.path.join(main_dir, "projects", project_name, "**", "src", "main", "java", "**", "*.java")
    source_paths = glob.glob(java_glob, recursive=True)

    counter = 0
    set_pre_class = []
    for path in source_paths:
        if "main/java/" not in path:
            continue
        if ".java" not in path:
            continue
        set = utils.read_java(path)
        for item in set:
            set_pre_class.append(item)

    if set_pre_class:
        sample_count = projects_method.get(project_name, DEFAULT_SAMPLE_COUNT)
        # Clamp to available population size
        sample_count = min(sample_count, len(set_pre_class))

        print(len(set_pre_class), project_name)
        list_per_file = {}
        sampled_set = random.sample(set_pre_class, sample_count)
        for pair in sampled_set:
            line_list = []
            if (pair[1]-pair[0]-1 <= 3) and (pair[1]-pair[0]-1 >= 0):
                line_list = random.sample(range(pair[0]+1, pair[1]), round(pair[1]-pair[0]-1))
            elif (pair[1]-pair[0]-1 > 3):
                line_list = random.sample(range(pair[0]+1, pair[1]), 3)
            if pair[3] not in list_per_file:
                list_per_file[pair[3]] = []
            list_per_file[pair[3]].extend(line_list)

        for path in list_per_file:
            list_per_file[path].sort()
            test_class = path.split("main/java/")[1].split(".java")[0].replace("/", ".")
            if list_per_file[path]:
                counter += 1
                root_dir_path = os.path.join(main_dir, "src", "leam", "location2")
                Path(root_dir_path).mkdir(parents=True, exist_ok=True)

                project_dir_path = os.path.join(root_dir_path, project_name)
                Path(project_dir_path).mkdir(parents=True, exist_ok=True)

                dir_path = os.path.join(project_dir_path, str(counter))
                Path(dir_path).mkdir(parents=True, exist_ok=True)
                location_file_path = os.path.join(dir_path, "parsed_ochiai_result")
                open(location_file_path, "w").close()

                with open(location_file_path, "a") as f:
                    for line in list_per_file[path]:
                        strs = f"{test_class}#{line}\t1\t{path}"
                        f.writelines(strs)
                        f.writelines("\n")


if __name__ == "__main__":
    args = sys.argv[1:]
    main_dir = args[0]

    projects_dir = os.path.join(main_dir, "projects")
    discovered = utils.discover_projects(projects_dir)

    for project in discovered:
        get_files(project, main_dir)
        print(project, "done")