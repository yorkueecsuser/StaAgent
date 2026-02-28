import re
import os
import shutil
import subprocess
from utils import get_arg_value, read_data_json_file, write_json_file, TOOL_RULE_COUNTS

tool = get_arg_value('--tool')
model = get_arg_value('--model')
file_count = TOOL_RULE_COUNTS[tool]

def update_json_file(json_file_data_name, json_content):
    current_json = read_data_json_file(json_file_data_name)
    current_json.update(json_content)
    write_json_file(json_file_data_name, current_json)

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def java_file_writer(file_name, java_file_content):
    with open(file_name, "w", encoding="utf-8") as file:
        file.write(java_file_content)

    print("\nDone successfully updating JAVA file\n")

        
def get_java_class_name(current_java_name, current_java_test_name, response_index):

    java_code = java_file_reader(current_java_name)

    java_test_code = java_file_reader(current_java_test_name)

    regex = r'class\s+([A-Z]\w*)'
    class_name = ""
    match = re.search(regex, java_code)
    if match:
        class_name = match.group(1)

        actual_java_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{class_name}.java"
        java_file_writer(actual_java_name, java_code)

        actual_java_test_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{class_name}Test.java"
        java_file_writer(actual_java_test_name, java_test_code)
           
    else:
        ## name called dummy if the class name can't be retrieved
        class_name = "dummy"

    return class_name

def build_maven(response_index, actual_class_name, java_mutant_code):

    file_short_path_in_maven = f"{tool}_clean_java_code_{model}/result_{tool}_{response_index}"
    file_long_test_path_in_maven = f"tools/src/test/java/com/sast/home/tools/{file_short_path_in_maven}"
    file_long_main_path_in_maven = f"tools/src/main/java/com/sast/home/tools/{file_short_path_in_maven}"

    # Remove prexisting package name 
    package_filter = r'(?m)^\s*package\s+.*\n?'
    java_mutant_code  = re.sub(package_filter, '', java_mutant_code)

    procesed_java_mutant_code = f"package com.sast.home.tools.{tool}_clean_java_code_{model}.result_{tool}_{response_index};\n\n{java_mutant_code}"

    # Update the jj
    java_mutant_actual_name = f"{actual_class_name}.java"
    java_file_writer(f"{os.environ["SASTTOOL_PROJECT_DIR"]}/{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{java_mutant_actual_name}", procesed_java_mutant_code)

    print(f"final code for maven build logging:\n\n{procesed_java_mutant_code}")

    if not os.path.exists(file_long_test_path_in_maven):
        print(f"Attempting to create test path: {file_long_test_path_in_maven}\n")
        os.makedirs(file_long_test_path_in_maven, exist_ok=True)

    if not os.path.exists(file_long_main_path_in_maven):
        print(f"Attempting to create main path: {file_long_main_path_in_maven}\n")
        os.makedirs(file_long_main_path_in_maven, exist_ok=True)

    current_location_for_javac = os.getcwd()
    print(f"Current location BEFORE maven transfer logging: {current_location_for_javac}")

    java_test_file = f"{os.environ["SASTTOOL_PROJECT_DIR"]}/{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{actual_class_name}Test.java"
    copy_test_command_lnx = f"cp {java_test_file} {file_long_test_path_in_maven}/{actual_class_name}Test.java"
    print(f"Copy command in maven logging: {copy_test_command_lnx}")
    os.system(copy_test_command_lnx)
    
    java_main_file = f"{os.environ["SASTTOOL_PROJECT_DIR"]}/{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{java_mutant_actual_name}"
    copy_main_command_lnx = f"cp {java_main_file} {file_long_main_path_in_maven}/{java_mutant_actual_name}"
    print(f"Copy command in maven logging: {copy_main_command_lnx}")
    os.system(copy_main_command_lnx)

    go_to_maven_home = f"{os.environ["SASTTOOL_PROJECT_DIR"]}/tools"
    os.chdir(go_to_maven_home)
    print(f"Current location AFTER maven transfer logging: {os.getcwd()}")
        
    current_folder = os.getcwd()
    print(f"Current folder: {current_folder}")
    run_mvn = f"mvn clean test"
    run_mvn_result = subprocess.run(run_mvn, shell=True, capture_output=True, text=True)

    print(f"Maven build RESULT with this output: {run_mvn_result.stdout}")

    processed_output = ""

    if "BUILD FAIL" in run_mvn_result.stdout:
        shutil.rmtree(file_long_test_path_in_maven)
        shutil.rmtree(file_long_main_path_in_maven)

        pattern = rf"^\[ERROR\].*test_{tool.title()}_"
        filtered_error_lines = [line for line in run_mvn_result.stdout.split("\n") if re.search(pattern, line)]
        compilation_error = "\n".join(filtered_error_lines)
        processed_output = compilation_error
    else:
        pattern = rf"^\[INFO\] Tests run:.*{actual_class_name}Test.*$"
        filtered_success_lines = [line for line in run_mvn_result.stdout.split("\n") if re.search(pattern, line)]
        compilation_output = "\n".join(filtered_success_lines)
        
    processed_output = compilation_output

    os.chdir(current_location_for_javac)
    return processed_output


def compile_java__test_code(response_index, actual_class_name, mutant_java_file):
    print(f"Compiler: Inside the MAIN location: {os.getcwd()}")

    current_location_for_javac = os.getcwd()
    go_to_java_directory = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
    os.chdir(go_to_java_directory)

    print(f"Compiler: Inside the RESULT location: {os.getcwd()}")

    java_test_actual_name = f"{actual_class_name}Test.java"
    java_test_file_name = f"test_{tool.title()}_{response_index}.java"
    
    java_mutant_actual_name = f"{actual_class_name}.java"
    java_mutant_file_name = f"{mutant_java_file}"

    # Move test file to the appropriate directory for compilation
    copy_command_lnx_test = f"cp {java_test_file_name} {java_test_actual_name}"
    print(f"copy command logging: {copy_command_lnx_test}")
    os.system(copy_command_lnx_test)

    # Move seed file to the appropriate directory for compilation
    copy_command_lnx_seed = f"cp {java_mutant_file_name} {java_mutant_actual_name}"
    print(f"copy command logging: {copy_command_lnx_seed}")
    os.system(copy_command_lnx_seed)

    java_mutant_code = java_file_reader(java_mutant_actual_name)
    print(f"verify that java mutant code before compilation:\n{java_mutant_code}")

    javac_compile_test_result = ""

    # Assuming that path has been changed back to the main directory
    if "springframework" in java_mutant_code:
        maven_build_result = build_maven(response_index, actual_class_name, java_mutant_code)
        javac_compile_test_result = maven_build_result
    else:
        javac_command = f"timeout 5s javac -encoding UTF-8 -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" {java_mutant_actual_name} {java_test_actual_name}"
        
        print(f"\nJavac compile command logging: {javac_command}\n")
        javac_compile_test = subprocess.run(javac_command, shell=True, capture_output=True, text=True)

        if javac_compile_test.returncode == 0:
            javac_compile_test_result = "passed"
            print(f"compilation output if error logging: {javac_compile_test.stdout}")
        else:
            javac_compile_test_result = f"{javac_compile_test.stderr}"
            print(f"compilation output if error logging: {javac_compile_test.stderr}")


    os.chdir(current_location_for_javac)
    return javac_compile_test_result

def run_java_test_code(actual_class_name):
    
    print(f"Runner: Inside the MAIN location: {os.getcwd()}")

    current_location_for_javac = os.getcwd()
    go_to_java_directory = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
    os.chdir(go_to_java_directory)

    print(f"Runner: Inside the RESULT location: {os.getcwd()}")

    java_command = f"timeout 5s java -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" org.junit.runner.JUnitCore {actual_class_name}Test"

    print(f"\nJava run command: {java_command}\n")
    java_run_result = subprocess.run(java_command, shell=True, capture_output=True, text=True)

    os.chdir(current_location_for_javac)

    return java_run_result


def mutant_test_runner(response_index, op_range, N, actual_class_name, json_file_data_name, current_json):

    runner_response = "false"    

    for mutant_index in range(1, N+1):
        
        mutant_java_file = f"mutant_{mutant_index}_OP{op_range}.java"
        mutant_java_file_path = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{mutant_java_file}"
        mutant_compilation_status_value = ""

        if f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result" in current_json:
            print(f"Skipping mutant test as previous result has been processed - \"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result\" found in the data_{tool.title()}_{response_index}.json")
            continue

        print(f"---------------------------------------------------Beginning-{mutant_java_file}-------------------------------------------------------------------")

        print(f"logging mutant file pull path: {mutant_java_file_path}\n")
        print(f"logging path when in runner: {os.getcwd()}\n")

        mutant_compilation_error_details = f"Mutant_{mutant_index}_OP{op_range}_Error_Details"
        
        mutant_compilation_status = f"Mutant_{mutant_index}_OP{op_range}_Compile_Status"
        if mutant_compilation_status in current_json:
            mutant_compilation_status_value = current_json[mutant_compilation_status]

        if os.path.exists(mutant_java_file_path) or mutant_compilation_error_details in current_json or mutant_compilation_status_value == "No":
            compile_result = compile_java__test_code(response_index, actual_class_name, mutant_java_file)
            if compile_result == "passed":
                print(f"compilation successful for {mutant_java_file}!")

                if (tool == "spotbugs" and response_index in [5,7,75,102,107,143]):
                    run_result = {
                        f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result": f"Runninng test will fail system because of infinite loop."
                    }
                    update_json_file(json_file_data_name, run_result)
                    continue

                if (tool == "prone" and response_index in [47,102,158]):
                    run_result = {
                        f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result": f"Runninng test will fail system because of infinite loop."
                    }
                    update_json_file(json_file_data_name, run_result)
                    continue

                if (tool == "sonar" and response_index in [3,84,106,123,136]):
                    run_result = {
                        f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result": f"Runninng test will fail system because of infinite loop."
                    }
                    update_json_file(json_file_data_name, run_result)
                    continue

                if (tool == "pmd" and response_index in []):
                    run_result = {
                        f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result": f"Runninng test will fail system because of infinite loop."
                    }
                    update_json_file(json_file_data_name, run_result)
                    continue

                run_result = run_java_test_code(actual_class_name)
                if run_result == "": 
                    print(f"logging: runner successful for {mutant_java_file}!")
                    print(f"Runner PASS result:\n{run_result.stdout}")
                    runner_response = "true"
                else:
                    print(f"Runner FAIL result:\n{run_result.stdout}")
                    print(f"logging: runner failed for {mutant_java_file}!")

                run_result = {
                    f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result" : f"{run_result.stdout}"
                }
                update_json_file(json_file_data_name, run_result)
            elif "SASTTool/tools/src" in compile_result:
                maven_run_result = {
                    f"Mutant_{mutant_index}_OP{op_range}_Test_Run_Result" : f"{compile_result}"
                }
                update_json_file(json_file_data_name, maven_run_result)
            else:
                print(f"logging: compilation failed for {mutant_java_file}!")
        else:
            print(f"logging: file not found {mutant_java_file}")
            continue

        print(f"------------------------------------------------------End-{mutant_java_file}------------------------------------------------------------------\n")
    
    return runner_response 


if __name__ in "__main__":

    response_index = 1

    for bug in range(file_count):
        
        java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        if not os.path.exists(java_file_name):
            java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}_junit_test.java"
        java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
        json_file_data_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"

        if not os.path.isdir(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}") or not os.path.exists(json_file_data_name):
            print(f"Skipped JSON file not found: {json_file_data_name}")
            response_index += 1
            continue
        current_json = read_data_json_file(json_file_data_name)

        print(f"Start operating on this folder==============================result_{tool.title()}_{response_index}==================================================================\n")
        if os.path.exists(java_test_file_name):
            if os.path.exists(json_file_data_name):
                
                actual_class_name = get_java_class_name(java_file_name, java_test_file_name, response_index)

                op_size = 9
                for op_range in range(1, op_size+1):
                    N = 3
                    mutant_test_runner(response_index, op_range, N, actual_class_name, json_file_data_name, current_json)

            else:
                print(f"Skipped JSON file not found: {json_file_data_name}")
                response_index = response_index + 1
                continue
        else:
            print(f"Skipped JAVA file not found: {java_test_file_name}")
            response_index = response_index + 1
            continue
        
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
        response_index = response_index + 1