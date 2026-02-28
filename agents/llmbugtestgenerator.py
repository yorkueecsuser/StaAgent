import json
import re
import sys
import os
import shutil
import subprocess
from transformers import pipeline
from llm_utils import get_pipe
from utils import get_arg_value, read_rule_file_as_pairs, read_data_json_file, write_json_file

tool = get_arg_value('--tool')
model = get_arg_value('--model')

def query_loaded_model(prompt_input, pipe: pipeline):
    """Generates high-quality Java code from the loaded model given an input prompt."""

    chats = [{"role": "user", "content": prompt_input}]
    output = pipe(chats, max_new_tokens=1536, batch_size=1)

    return output[0]["generated_text"][-1]['content']

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def java_file_writer(file_name, java_file_content):
    with open(file_name, "w", encoding="utf-8") as file:
        file.write(java_file_content)

def process_model_response(llm_output, response_index, title, description):

    # regex1 = r"```java\s+([\s\S]*?)\s*```"
    # regex1 = r"```java\s*\n((?:import|package|public|//)\s+[\w.]+;[\s\S]*?)\s*```"
    regex1 = r"```Java(.*?)```"
    regex2 = r"```java(.*?)```"
    regex3 = r"```JAVA(.*?)```"
    java_code_match = re.search(regex1, llm_output, re.DOTALL) or re.search(regex2, llm_output, re.DOTALL)  or re.search(regex3, llm_output, re.DOTALL) 
    
    if java_code_match:
        java_code = java_code_match.group(1).strip()
        output_file = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java" 
        rule_description = f"Rule Title: {title}\nRule Description: {description}"
        if java_code != "":
            
            # Remove lines that begin with "Package" to address compilation errors
            package_filter = r'(?m)^\s*package\s+.*\n?'
            java_code  = re.sub(package_filter, '', java_code)
            
            # Remove public final to address compilation error since it's not required
            public_final_filter = r'\bpublic\s+final\b'
            java_code = re.sub(public_final_filter, '', java_code)

            java_file_writer(output_file, java_code)

            print(f"Final java code is: {java_code}")

def compile_java_code(response_index, actual_class_name):
    print(f"Compile: Inside the MAIN location: {os.getcwd()}")

    current_location_for_javac = os.getcwd()
    go_to_java_directory = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
    os.chdir(go_to_java_directory)

    print(f"Compile: Inside the RESULT location: {os.getcwd()}")

    java_test_actual_name = f"{actual_class_name}Test.java"
    java_test_file_name = f"test_{tool.title()}_{response_index}.java"
    
    java_actual_name = f"{actual_class_name}.java"
    java_file_name = f"seed_{tool.title()}_{response_index}.java"

    #Move test file to the appropriate directory for compilation
    copy_command_lnx_test = f"cp {java_test_file_name} {java_test_actual_name}"
    print(f"copy command logging: {copy_command_lnx_test}")
    os.system(copy_command_lnx_test)

    #Move seed file to the appropriate directory for compilation
    copy_command_lnx_seed = f"cp {java_file_name} {java_actual_name}"
    print(f"copy command logging: {copy_command_lnx_seed}")
    os.system(copy_command_lnx_seed)
    
    javac_command = f"timeout 5s javac -encoding UTF-8 -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" {java_actual_name} {java_test_actual_name}"
    
    print(f"\nJavac compile command: {javac_command}\n")
    javac_compile_result = subprocess.run(javac_command, shell=True, capture_output=True, text=True)

    os.chdir(current_location_for_javac)
    
    return javac_compile_result

def run_java_code(actual_class_name, response_index):

    print(f"Run: Inside the MAIN location: {os.getcwd()}")

    current_location_for_javac = os.getcwd()
    go_to_java_directory = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
    os.chdir(go_to_java_directory)

    print(f"Run: Inside the RESULT location: {os.getcwd()}")

    java_command = f"timeout 5s java -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" org.junit.runner.JUnitCore {actual_class_name}Test"

    print(f"\nJava run command: {java_command}\n")
    java_compile_result = subprocess.run(java_command, shell=True, capture_output=True, text=True)

    os.chdir(current_location_for_javac)

    return java_compile_result

def remove_compiled_classes(response_index): 
    delete_class_cmd_lnx = f"rm -rf {tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/*.class"
    os.system(delete_class_cmd_lnx)
    print("Files removed successfully.")

def remove_actual_java_file(actual_java_name, response_index):
    if actual_java_name != "":
        delete_class_cmd_lnx = f"rm -rf {tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{actual_java_name}*"
        os.system(delete_class_cmd_lnx)
        print("Actual files removed successfully.")
    else:
        print("No file to delete - No action taken.")

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
        class_name = "dummy"

    return class_name

def process_update_json_response(json_file_path, raw_response):
    pattern1 = r'```JSON\s*(\{[\s\S]*?\})\s*```'
    pattern2 = r'```json\s*(\{[\s\S]*?\})\s*```'
    pattern3 = r'```Json\s*(\{[\s\S]*?\})\s*```'
    pattern4 = r'```\s*(\{[\s\S]*?\})\s*```'
    pattern5 = r'(\{\s*\n\s*".*?\n\})'
    match = re.search(pattern1, raw_response) or re.search(pattern2, raw_response) or re.search(pattern3, raw_response) or re.search(pattern4, raw_response) or re.search(pattern5, raw_response)
    
    if match:
        try:
            new_json_str = match.group(1)

            current_json = read_data_json_file(json_file_path)

            new_data = json.loads(new_json_str)

            filtered_new_data = {}

            if "Trigger_Explanation" in new_data:
                filtered_new_data["Trigger_Explanation"] = new_data["Trigger_Explanation"]

            if "Trigger_Line" in new_data:
                filtered_new_data["Trigger_Line"] = new_data["Trigger_Line"]

            filtered_new_data = {k: v for k, v in filtered_new_data.items() if v is not None}

            current_json.update(filtered_new_data)

            write_json_file(json_file_path, current_json)

            print("Successful: Completed JSON file update")
        except Exception as e:
            print("Something went wrong while attempting to update the JSON file:", str(e))

                
def process_compilation(title, description, java_file_name, response_index, success_compilation_counter, pipe):
    # Skip the JUNIT test generator if there is no file to be tested

    java_code = java_file_reader(java_file_name)
    file_and_code_present = 1
    actual_class_name = ""
    compilation_status = ""
    valid_code_format = 1
    spring_success_ouput = ""

    json_file_data =  f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
    if os.path.exists(json_file_data):
        meta_data = read_data_json_file(json_file_data)
        bug_explanation = meta_data.get("Bug_Explanation")
        buggy_lines = meta_data.get("Buggy_Line",[])
    else:
        write_json_file(json_file_data, {})
        bug_explanation = ""
        buggy_lines = []
  
    trigger_bug_msg = (
            "Generate a JUnit 4 test code that MUST do these two things:\n"
            "1. COMPILE SUCCESSFULLY without any errors\n"
            "2. Contain test cases that fail and TRIGGER the bug with the given details, " 
            f"the line numbers with the bug in the Java code, and the comment in the code ' // BUG: {title}' indicating it's location \n"
            "\n"
            f"Bug Rule: {title}\n"
            f"Description: {description}\n"
            f"Bug Explanation: {bug_explanation}\n"
            f"Buggy Lines in the Java code: {buggy_lines}\n"
            f"Java Class to Test:\n{java_code}\n"
            "\n"
            "Test Code Requirements:\n"
            "1. Use these exact imports:\n"
            "   import org.junit.Test;\n"
            "   import static org.junit.Assert.*;\n"
            "2. Name the class [OriginalClassName]Test\n"
            "3. Include @Test annotation. DO NOT include `expected` property inside @Test\n"
            f"4. MUST append this comment '// TRIGGER BUG: {title}' as a suffix in the line or lines where the bug is triggered\n"
            "5. The given Java code has a method `showBug`. The test should call that method in the test cases.\n"
            "6. To trigger the bug, the JUnit test should fail. DO NOT catch the exception resulting from the bug triggering "
            "and DO NOT add the failing exception to @Expected.\n"
            "\n"
            "Avoid doing the following:\n"
            "1. DO NOT ask questions\n"
            "2. DO NOT give partial code\n"
            "3. DO NOT use external libraries that are not essential to the triggering the bug\n"
            "4. DO NOT generate an example code only generate the compilable java code\n"
            "5. DO NOT reimplement the buggy code in the `showBug` method. Call the `showBug` to demonstrate the bug in the test.\n"
            "Format your response as follows:\n"
            "1. Provide the Java code enclosed in triple backticks\n"
            "2. Fill out the JSON object form to provide meta data of the code and the bug (verify JSON format to ensure accuracy)\n"
            "3. The JSON object output must be enclosed in triple backticks (```JSON\n *output goes here* \n```)\n"
            "4. List and justify any non-standard imports (if used)\n"
            "\n"
            "The following section outlines the format of output the generated Java code:\n\n"
            "```Java\n"
            "[Java test code generated by following the given instructions]\n"
            "```\n\n"
            "The JSON object containing meta data of the Java Code must follow this exact format:\n\n"
            "{\n"
            '  "Trigger_Explanation": "[explanation of how the generated JUNIT test case triggered the bug]",\n'
            '  "Trigger_Line": "[digit of the exact line numbers of test code that trigger the bug should be outputed in a JSON list (verify the digits to ensure precision)]"\n'
            "}\n\n"
        )

    # Model is called with the appropriate message
    raw_model_response = query_loaded_model(trigger_bug_msg, pipe)
    print("---------------------------------------------------Beginning-------------------------------------------------------------------")
    print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
    print(f"------------------------------------------------------End-1------------------------------------------------------------------\n")

    # Result is processed and the code is stored in a Java file withe appropriate name
    process_result = process_model_response(raw_model_response, response_index, title, description)
    process_update_json_response(json_file_data, raw_model_response)

    # Save the content of the original java file in the appropriate file name - so that it can be compile successfully
    java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
    if os.path.exists(java_test_file_name):
        actual_class_name = get_java_class_name(java_file_name, java_test_file_name, response_index)
        if actual_class_name == "dummy":
            valid_code_format = 0
            return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
    # The java code is compiled with the compilation result status stored in that variable
    compilation_status = compile_java_code(response_index, actual_class_name)  
    

    if compilation_status.returncode != 0:
        print(f"Compilation failed: Here are the error detail\n{compilation_status.stderr}")
        
        n = 2
        for compile_index in range(2,n+1):
            java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
            if not os.path.exists(java_test_file_name):
                file_and_code_present = 0
                return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
            java_test_code = java_file_reader(java_test_file_name)

            compilation_error = compilation_status.stderr

            if "springframework" in compilation_error:
                file_name = f"test_{tool.title()}_{response_index}.java"
                maven_compile_result = build_maven(java_test_file_name, file_name, response_index, actual_class_name)
                if "ERROR" not in maven_compile_result:
                    print(f"Compilation succeeded!") 
                    process_update_json_response(json_file_data, raw_model_response)
                    success_compilation_counter = success_compilation_counter + 1  

                    matches = re.findall(rf"^\[INFO\] Tests run:.*{actual_class_name}Test.*$", maven_compile_result, flags=re.MULTILINE)
                    for match in matches:
                        spring_success_ouput += match + "\n"
                    print(f"Current number of successful compilations: {success_compilation_counter}")
                    
                    return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
                else:
                    pattern = rf"^\[ERROR\].*test_{tool.title()}_"
                    filtered_error_lines = [line for line in maven_compile_result.split("\n") if re.search(pattern, line)]
                    compilation_error = "\n".join(filtered_error_lines)
                    spring_success_ouput = compilation_error

            print(f"MAVEN build result variable logging:\n{spring_success_ouput}")

            test_fix_msg = (
                "Fix the JUnit test code below to do these two things:\n"
                "1. COMPILE SUCCESSFULLY by fixing all errors\n"
                "2. KEEP TRIGGERING the original bug and the test should fail at that bug\n"
                "3. The given Java code has a method `showBug`. The test should call that method in the test cases.\n"
                "4. Update the line number (Trigger line) where the bug is triggered if it changed\n"
                "\n"
                f"Bug Rule: {title}\n"
                f"Description: {description}\n"
                f"Original Class:\n{java_code}\n"
                f"Test Code With Errors:\n{java_test_code}\n"
                f"Compilation Errors:\n{compilation_error}\n"
                "\n"
                "Required Fixes:\n"
                "1. Fix imports:\n"
                "   - Keep or add: import org.junit.Test;\n"
                "   - Keep or add: import static org.junit.Assert.*;\n"
                "   - Remove problematic imports\n"
                "   - Add only essential imports\n"
                "2. Keep these unchanged:\n"
                f"   - '// TRIGGER BUG: {title}' comment location\n"
                "   - Test logic that triggers the bug\n"
                "   - Existing assertions\n"
                "\n"
                "DO NOT:\n"
                "1. Ask questions\n"
                "2. Change test logic\n"
                "3. Add external libraries\n"
                "4. Suggest alternatives\n"
                "5. Generate an example code only generate the compilable java code\n"
                "Important instruction on output:\n"
                "1. The JSON object output must be enclosed in triple backticks (```JSON\n *output goes here* \n```)\n"
                "\n"
                "The following section outlines the format of output the generated Java code:\n\n"
                "```Java\n"
                "[Java test code generated by following the given instructions]\n"
                "```\n\n"
                "The JSON object containing meta data of the Java Code must follow this exact format:\n\n"
                "{\n"
                '  "Trigger_Explanation": "[explanation of how the generated JUNIT test case triggered the bug]",\n'
                '  "Trigger_Line": "[digit of the exact line numbers of test code that trigger the bug should be outputed in a JSON list (verify the digits to ensure precision)]"\n'
                "}\n\n"
            )

            raw_model_response = query_loaded_model(test_fix_msg, pipe)

            # Result is processed and the code is stored in a Java file withe appropriate name
            process_result = process_model_response(raw_model_response, response_index, title, description)
            process_update_json_response(json_file_data, raw_model_response)

            print("---------------------------------------------------Beginning-------------------------------------------------------------------")
            print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
            print(f"------------------------------------------------------End-{compile_index}------------------------------------------------------------------\n")

            # Save the content of the original java file in the appropriate file name - so that it can be compile successfully
            java_file_test_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"

            if os.path.exists(java_file_test_name):
                actual_class_name = get_java_class_name(java_file_name, java_file_test_name, response_index)
                if actual_class_name == "dummy":
                    valid_code_format = 0
                    return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput

            # The java code is compiled with the compilation result status stored in that variable
            compilation_status = compile_java_code(response_index, actual_class_name)  

            if compilation_status.returncode == 0:
                success_compilation_counter = success_compilation_counter + 1  
                print(f"Compilation succeeded attempt: {compile_index}") 
                print(f"Current number of successful compilations: {success_compilation_counter}")
                return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
            else:
                print(f"Failure occured with this compilation error: \n{compilation_status.stderr}")

    if compilation_status.returncode != 0:

        # Model is called with the appropriate message
        raw_model_response = query_loaded_model(trigger_bug_msg, pipe)
        print("---------------------------------------------------Beginning-------------------------------------------------------------------")
        print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
        print(f"----------------------------------------------------End-4------------------------------------------------------------------\n")


        # Result is processed and the code is stored in a Java file withe appropriate name
        process_result = process_model_response(raw_model_response, response_index, title, description)
        process_update_json_response(json_file_data, raw_model_response)

        java_file_test_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
        if os.path.exists(java_file_test_name):
            actual_class_name = get_java_class_name(java_file_name, java_file_test_name, response_index)
            if actual_class_name == "dummy":
                valid_code_format = 0
                return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput

        # The java code is compiled with the compilation result status stored in that variable
        compilation_status = compile_java_code(response_index, actual_class_name)   

        if compilation_status.returncode != 0:
            m = 5
            for compile_index in range(5, m+1):
                java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
                if not os.path.exists(java_file_name):
                    file_and_code_present = 0
                    return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput

                java_test_code = java_file_reader(java_test_file_name)

                compilation_error = compilation_status.stderr

                if "springframework" in compilation_error:
                    file_name = f"test_{tool.title()}_{response_index}.java"
                    maven_compile_result = build_maven(java_test_file_name, file_name, response_index, actual_class_name)
                    if "ERROR" not in maven_compile_result:
                        print(f"Compilation succeeded!") 
                        success_compilation_counter = success_compilation_counter + 1  

                        matches = re.findall(rf"^\[INFO\] Tests run:.*{actual_class_name}Test.*$", maven_compile_result, flags=re.MULTILINE)
                        for match in matches:
                            spring_success_ouput += match + "\n"
                        print(f"Current number of successful compilations: {success_compilation_counter}")
                       
                        return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
                    else:
                        pattern = rf"^\[ERROR\].*test_{tool.title()}_"
                        filtered_error_lines = [line for line in maven_compile_result.split("\n") if re.search(pattern, line)]
                        compilation_error = "\n".join(filtered_error_lines)
                        spring_success_ouput = compilation_error

                print(f"MAVEN build result variable logging:\n{spring_success_ouput}")

                raw_model_response = query_loaded_model(test_fix_msg, pipe)

                print("---------------------------------------------------Beginning-------------------------------------------------------------------")
                print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
                print(f"------------------------------------------------------End-{compile_index}-------------------------------------------------------------------\n")

                # Result is processed and the code is stored in a Java file withe appropriate name
                process_result = process_model_response(raw_model_response, response_index, title, description)
                process_update_json_response(json_file_data, raw_model_response)
                
                java_file_test_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
                if os.path.exists(java_file_test_name):
                    actual_class_name = get_java_class_name(java_file_name, java_file_test_name, response_index)
                    if actual_class_name == "dummy":
                        valid_code_format = 0
                        return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput

                # The java code is compiled with the compilation result status stored in that variable
                compilation_status = compile_java_code(response_index, actual_class_name)  

                if compilation_status.returncode == 0:
                    print(f"Compilation of regenerated code succeeded on attempt: {compile_index}") 
                    success_compilation_counter = success_compilation_counter + 1  
                    print(f"Current number of successful compilations: {success_compilation_counter}")
                    return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
                else: 
                    print(f"Compilation of regenereate code attempt {compile_index} failed!")
        else:
            print(f"Compilation succeeded!") 
            success_compilation_counter = success_compilation_counter + 1  
            print(f"Current number of successful compilations: {success_compilation_counter}")
            return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput
    else:
        print(f"Compilation succeeded!") 
        success_compilation_counter = success_compilation_counter + 1  
        print(f"Current number of successful compilations: {success_compilation_counter}")

    return file_and_code_present, success_compilation_counter, actual_class_name, compilation_status, valid_code_format, spring_success_ouput

def update_json_file(json_file_data, runner_output):
    current_json = read_data_json_file(json_file_data)
    current_json.update(runner_output)
    write_json_file(json_file_data, current_json)
    

def process_runner(java_file_name, response_index, spring_success_ouput):

    java_file_test_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java" 
    actual_class_name = get_java_class_name(java_file_name, java_file_test_name, response_index)

    json_file_data =  f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
    if not os.path.exists(json_file_data):
        write_json_file(json_file_data, {})

    if (tool == "spotbugs" and response_index in [5,7,102,107]):
        runner_output = {
            "Test_Run_Result": f"Runninng test will fail system because of infinite loop."
        }
        update_json_file(json_file_data, runner_output)
        return

    if (tool == "prone" and response_index in [47,102,158]):
        runner_output = {
            "Test_Run_Result": f"Runninng test will fail system because of infinite loop."
        }
        update_json_file(json_file_data, runner_output)
        return

    if (tool == "sonar" and response_index in [3,84,106,123,136]):
        runner_output = {
            "Test_Run_Result": f"Runninng test will fail system because of infinite loop."
        }
        update_json_file(json_file_data, runner_output)
        return

    if (tool == "pmd" and response_index in []):
        runner_output = {
            "Test_Run_Result": f"Runninng test will fail system because of infinite loop."
        }
        update_json_file(json_file_data, runner_output)
        return

    run_status = run_java_code(actual_class_name, response_index)

    print(f"OUTPUT from running the java code: {run_status.stdout}\n")
    
    if spring_success_ouput != "": 
        runner_output = {
            "Test_Run_Result": f"{spring_success_ouput}"
        }
    else:
        runner_output = {
            "Test_Run_Result": f"{run_status.stdout}"
        }
    
    update_json_file(json_file_data, runner_output)
    
    
def build_maven(file_path, file_name, response_index, actual_class_name):
    # To avoid compilation errors create a new folder for the specific java file
    file_short_path_in_maven = f"{tool}_clean_java_code_{model}/result_{tool}_{response_index}"
    file_long_path_in_maven = f"tools/src/test/java/com/sast/home/tools/{file_short_path_in_maven}"
    
    # To avoid duplicate file failure that was common in maven build
    java_code = java_file_reader(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{file_name}")
    
    # Remove prexisting package name 
    package_filter = r'(?m)^\s*package\s+.*\n?'
    java_code  = re.sub(package_filter, '', java_code)
    
    # Add package name for maven build location 
    procesed_java_code = f"package com.sast.home.tools.{tool}_clean_java_code_{model}.result_{tool}_{response_index};\n\n{java_code}"
    java_file_writer(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{file_name}", procesed_java_code)
    
    print(f"Final code for maven build logging: {procesed_java_code}")

    if not os.path.exists(file_long_path_in_maven):
        print(f"Attempting to create this path: {file_long_path_in_maven}\n")
        os.makedirs(file_long_path_in_maven, exist_ok=True)
        
    # Get the current path so you can return here to keep running javac commands
    current_location_for_javac = os.getcwd()
    print(f"Current location BEFORE maven transfer logging: {current_location_for_javac}")

    copy_command_lnx = f"cp {file_path} {file_long_path_in_maven}/{actual_class_name}Test.java"
    print(f"Copy command in maven logging: {copy_command_lnx}")
    os.system(copy_command_lnx)
    
    go_to_maven_home = f"{os.environ["SASTTOOL_PROJECT_DIR"]}/tools"
    os.chdir(go_to_maven_home)
    print(f"Current location AFTER maven transfer logging: {os.getcwd()}")
        
    current_folder = os.getcwd()
    print(f"Current folder: {current_folder}")
    run_mvn = f"mvn clean test"
    run_mvn_result = subprocess.run(run_mvn, shell=True, capture_output=True, text=True)
    
    # At the moment we just delete the files in that location - might want to try to import libraries dynamically in the future
    if "BUILD FAIL" in run_mvn_result.stdout:
        #command below deletes the folder if maven fails
        shutil.rmtree(file_long_path_in_maven)
        print(f"Maven failed with this output: {run_mvn_result.stdout}")
        os.chdir(current_location_for_javac)
        return run_mvn_result.stdout
    
    os.chdir(current_location_for_javac)
    print(f"Return to location to run javac command: {current_location_for_javac}")
    print(f"Maven succeeded with this output: {run_mvn_result.stdout}")
    return run_mvn_result.stdout

if __name__ in "__main__":

    pipe = get_pipe(model)

    # Load in the list of rules from the input JSON file
    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")

    success_compilation_counter = 0
    success_running_counter = 0

    response_index = 1
    for title, description in list_of_pairs:

        print(f"Start operating on this folder==============================Result_{tool.title()}_{response_index}===============================================================\n")

        # Initialize the Java code and Java test code names
        java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
      
        # Confirm that the Java class exists - If not then go to the next rule
        if not os.path.exists(java_file_name):
            java_file_name = java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}_junit_test.java"
            if not os.path.exists(java_file_name):
                print(f"Current Compilation Success Counter: {success_compilation_counter}")
                print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
    
                response_index = response_index + 1
                continue

        # To avoid unnecessary compilation - Check if the Java test file exists
        # If test file exists, attempt to compile 
        # If compilation is successful, attempt to run Java test cases
        if os.path.exists(java_test_file_name):
            actual_class_name = get_java_class_name(java_file_name, java_test_file_name, response_index)
            compile_response = compile_java_code(response_index, actual_class_name)

            if compile_response.returncode == 0:
                success_compilation_counter = success_compilation_counter + 1
                print("Compilation succeeded!")
                spring_success_ouput = ""

                # Since compilation was successfully processed this runs the generated Java test class
                process_runner(java_file_name, response_index, spring_success_ouput)
                
                print(f"Current Compilation Success Counter: {success_compilation_counter}")
                print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

                response_index = response_index + 1
                remove_compiled_classes(response_index)
                continue
            
        # If the Java test file do no exist - Then this will generate a Java test file 
        # Attempt to compile generated Java test class - If attempt fails try 10 times in total
        # If all 10 attempts fail then move on to the next bug description 
        compilation_proceeded = process_compilation(title, description, java_file_name, response_index, success_compilation_counter, pipe)
            
        # If the java file does not exist then no code was generated for the rule - then skip the current iteration
        if compilation_proceeded[0] != 1 or compilation_proceeded[4] != 1:
            print(f"Current Compilation Success Counter: {success_compilation_counter}")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
            actual_java_file_name = compilation_proceeded[2]
            
            response_index = response_index + 1
            continue

        # If compilation was successfully processed then run the generated Java test class
        if compilation_proceeded[3].returncode == 0:
            spring_success_ouput = compilation_proceeded[5]
            process_runner(java_file_name, response_index, spring_success_ouput)
        
        success_compilation_counter = compilation_proceeded[1]

        actual_java_file_name = compilation_proceeded[2]
        remove_compiled_classes(response_index)
        
        print(f"Current Compilation Success Counter: {success_compilation_counter}")
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

        response_index = response_index + 1
    
print(f"Total number of successful compilation: {success_compilation_counter}")