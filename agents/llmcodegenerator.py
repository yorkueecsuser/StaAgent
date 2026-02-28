import json
import re
import os
import shutil
import subprocess
from transformers import pipeline
from llm_utils import get_pipe
from utils import get_arg_value, read_rule_file_as_pairs
from collections import OrderedDict

tool = get_arg_value('--tool')
model = get_arg_value('--model')

def query_loaded_model(prompt_input, pipe: pipeline):
    """Generates high-quality Java code from the loaded model given an input prompt."""

    chats = [{"role": "user", "content": prompt_input}]
    output = pipe(chats, max_new_tokens=2048, batch_size=1)

    return output[0]["generated_text"][-1]['content']

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def java_file_writer(file_name, java_file_content):
    with open(file_name, "w", encoding="utf-8") as file:
        file.write(java_file_content)

def remove_compiled_classes(response_index): 
    delete_class_cmd_lnx = f"rm -rf {tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/*.class"
    os.system(delete_class_cmd_lnx)
    print("Removed all the .class files successfully")

def contains_test_related_code(final_java_code):
    # Pattern to match "class *Test*"
    # class_test_pattern = r"\bclass\s+\w*Test\w*"
    
    # Direct import check for JUnit
    junit_import_pattern = r"\bimport\s+org\.junit"

    junit_import_pattern_2 = r"\bimport\s+junit\.framework"

    annotation_pattern = r"\b@\s*(Test|Before|BeforeEach|BeforeClass|After|AfterEach|AfterClass|Ignore|Disabled)\b"

    # Check if either pattern exists in the Java code
    return bool(re.search(annotation_pattern, final_java_code)) or bool(re.search(junit_import_pattern, final_java_code)) or bool(re.search(junit_import_pattern_2, final_java_code))
    
def compile_java_code(response_index):
    file_name = ""
    if os.path.exists(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}_junit_test.java"):
        file_name = f"seed_{tool.title()}_{response_index}_junit_test.java"
    else:
        file_name = f"seed_{tool.title()}_{response_index}.java"

    
    javac_command = f"timeout 10s javac -encoding UTF-8 -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" {tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{file_name}"
    
    print(f"\nJAVAC command: {javac_command}")
    
    javac_compile_result = subprocess.run(javac_command, shell=True, capture_output=True, text=True)
    
    return javac_compile_result

def build_maven(file_path, file_name, response_index, actual_class_name):
    # To avoid compilation errors create a new folder for the specific java file
    file_short_path_in_maven = f"{tool}_clean_java_code_{model}/result_{tool}_{response_index}"
    # file_short_path_in_maven = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
    file_long_path_in_maven = f"tools/src/main/java/com/sast/home/tools/{file_short_path_in_maven}"
    
    # To avoid duplicate file failure that was common in maven build
    java_code = java_file_reader(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{file_name}")
    
    # Remove prexisting package name 
    package_filter = r'(?m)^\s*package\s+.*\n?'
    java_code  = re.sub(package_filter, '', java_code)
    #Add "public class" back into the java code  
    java_code = re.sub(r"\bclass\b", "public class", java_code)
    
    # Add package name for maven build location 
    processed_java_code = f"package com.sast.home.tools.{tool}_clean_java_code_{model}.result_{tool}_{response_index};\n\n{java_code}"
    java_file_writer(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/{file_name}", processed_java_code)
    
    if not os.path.exists(file_long_path_in_maven):
        print(f"Attempting to create this path: {file_long_path_in_maven}\n")
        os.makedirs(file_long_path_in_maven, exist_ok=True)
        
    # Get the current path so you can return here to keep running javac commands
    current_location_for_javac = os.getcwd()
    
            
    # copy_command_wnd = f'powershell.exe -Command "Copy-Item -Path \'{file_path}\' -Destination \'{file_long_path_in_maven}/{file_name}\'"'
    copy_command_lnx = f"cp {file_path} {file_long_path_in_maven}/{actual_class_name}.java"
    os.system(copy_command_lnx)
    
    print(f"cp command: {copy_command_lnx}")

    go_to_maven_home = f"{os.environ['SASTTOOL_PROJECT_DIR']}/tools"
    os.chdir(go_to_maven_home)
    
    current_folder = os.getcwd()
    print(f"Current folder: {current_folder}")
    run_mvn = f"mvn clean compile"
    run_mvn_result = subprocess.run(run_mvn, shell=True, capture_output=True, text=True)
            
    # print(f"result of maven build: {run_mvn_result.stdout}")
    
    # At the moment we just delete the files in that location - might want to try to import libraries dynamically in the future
    if "BUILD FAIL" in run_mvn_result.stdout:
        #command below deletes the folder if maven fails
        shutil.rmtree(file_long_path_in_maven)
        # print("Maven command failed with this error {run_mvn_result.stderr} \nThe following folder was deleted: {file_long_path_in_maven}\nReturned to path for javac command to keep running!")
        print(f"Maven failed with this output: {run_mvn_result.stdout}")
        os.chdir(current_location_for_javac)
        return run_mvn_result
    
    os.chdir(current_location_for_javac)
    print(f"Return to location to run javac command: {current_location_for_javac}")
    print(f"Maven succeeded with this output: {run_mvn_result.stdout}")
    return run_mvn_result

def process_json_response(raw_response, response_index, title, description):
    print("Home of json response\n")

    pattern1 = r'```JSON\s*(\{[\s\S]*?\})\s*```'
    pattern2 = r'```json\s*(\{[\s\S]*?\})\s*```'
    pattern3 = r'```Json\s*(\{[\s\S]*?\})\s*```'
    pattern4 = r'```\s*(\{[\s\S]*?\})\s*```'
    match = re.search(pattern1, raw_response) or re.search(pattern2, raw_response) or re.search(pattern3, raw_response) or re.search(pattern4, raw_response)
    
    if match:
        json_str = match.group(1)
        print(f"Here is the JSON string: {json_str}")

        try:
            json_obj = json.loads(json_str)
            print(f"Output of json response: {json_obj}\n")
            
            ordered_json = OrderedDict()
            ordered_json["Bug_Title"] = title
            ordered_json["Bug_Details"] = description
            ordered_json.update(json_obj)
            
            with open(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json", "w", encoding="utf-8") as f:
                json.dump(ordered_json, f, indent=2)

        except (json.JSONDecodeError, Exception) as e:
            print(f"Error: {str(e)}")
    
def process_model_response(llm_output, response_index, title, description):

    # Extract Java code and the rule description
    regex1 = r"```Java(.*?)```"
    regex2 = r"```java(.*?)```"
    regex3 = r"```JAVA(.*?)```"
    java_code_match = re.search(regex1, llm_output, re.DOTALL) or re.search(regex2, llm_output, re.DOTALL)  or re.search(regex3, llm_output, re.DOTALL) 

    bool = 1

    output_file = f"seed_{tool.title()}_{response_index}.java"
    if java_code_match:
        java_code = java_code_match.group(1).strip()

        # Remove the "public" keyword from the class declaration
        java_code = re.sub(r"\bpublic\s+class\b", "class", java_code)
        
        # Remove lines that begin with "Package" to address compilation errors
        package_filter = r'(?m)^\s*package\s+.*\n?'
        java_code  = re.sub(package_filter, '', java_code)
        
        # Remove public final to address compilation error since it's not required
        public_final_filter = r'\bpublic\s+final\b'
        java_code = re.sub(public_final_filter, '', java_code)

        # Add rule description as a comment at the top of the Java code
        final_java_code = f"{java_code}"

        output_folder = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}"
        if not os.path.exists(output_folder):
            os.makedirs(output_folder)

        # Bool which is return in this method is set to 1 - With the appropriate libraries JUNIT files shoulds compile
        if contains_test_related_code(final_java_code):
            output_test_file = f"seed_{tool.title()}_{response_index}_junit_test.java"
            file_path = os.path.join(output_folder, output_test_file)
            java_file_writer(file_path, final_java_code)
            bool = 1
            return bool
            
        # Save the Java code to a .java file
        file_path = os.path.join(output_folder, output_file)
        java_file_writer(file_path, final_java_code)
        
        print(f"Java code extracted and saved at {file_path}")
        
        bool = 1
        return bool
        
    else:
        print(f"Error: No Java code found in the input file {output_file}")
        bool = 0
        return bool

def get_java_class_name(current_java_name, response_index):

        java_code = java_file_reader(current_java_name)

        regex = r'class\s+([A-Z]\w*)'
        class_name = ""
        match = re.search(regex, java_code)
        if match:
            class_name = match.group(1)

        else:
            class_name = "dummy"

        return class_name

def process_compilation(title, description, java_file_name, response_index, success_compilation_counter, pipe):
    # Skip the JUNIT test generator if there is no file to be tested

    file_and_code_present = 1
    compilation_status = None
    actual_class_name = ""
  
    gen_seed_msg = (
                "You are a Java programmer creating examples of common software bugs. "
                "Generate a single Java file that demonstrates the bug described below. "
                "Ensure that the meta data JSON object form is filled out for every generated Java code. "
                "IMPORTANT: Use only standard Java imports or imports that are absolutely essential to demonstrate the specific bug.\n"
                "\n"
                f"Bug Rule: {title}\n"
                f"Description: {description}\n"
                "\n"
                "Import Requirements (STRICT):\n"
                "1. Use ONLY java.* and javax.* packages by default\n"
                "2. Additional imports are allowed ONLY if they are:\n"
                "   - Explicitly mentioned in the bug rule or description\n"
                "   - Absolutely necessary to demonstrate the specific bug\n"
                "3. DO NOT include imports for:\n"
                "   - General utility functions that can be written in standard Java\n"
                "   - External libraries unless specifically required by the bug\n"
                "   - Framework-specific packages (Android, Google libraries, etc.) unless the bug is about that framework\n"
                "4. If in doubt, implement the functionality using standard Java instead of importing\n"
                "\n"
                "Core Requirements:\n"
                "1. The code must compile successfully\n"
                "2. The code must contain the exact bug described in the rule\n"
                f"3. Generated code MUST append this comment '// BUG: {title}' as a suffix on the exact line or lines containing the bug\n"
                "4. Add a public method named `showBug` that can be called from an outside file to demonstrate the bug. If the method uses data like"
                " arrays or other values, then these values should be passed as input parameters."
                "5. The `showBug` method should return the value(s) generated by the buggy code. If there are multiple use cases where the bug occurs,"
                " you may create multiple methods like `showBug1`, `showBug2`, etc.\n"
                "\n"
                "Code Structure Reuirements:\n"
                "1. The entire code must be in one file\n"
                "2. Do NOT use 'Test' or 'test' in class names (unless it's a JUnit test)\n"
                "3. Ensure all objects and methods are properly declared\n"
                "4. If using inheritance, include all required implementations\n"
                "\n"
                "Additional Constraints:\n"
                "1. Do NOT fix the bug - it must be present in the code\n"
                "2. Prefer standard Java implementations over external libraries\n"
                "\n"
                "Format your response as follows:\n"
                "1. Provide the Java code enclosed in triple backticks\n"
                "2. Fill out the JSON object form to provide meta data of the code and the bug (verify JSON format to ensure accuracy)\n"
                "3. The JSON object output must be enclosed in triple backticks\n"
                "4. List and justify any non-standard imports (if used)\n"
                "The following section outlines the format of output the generated Java code:\n\n"
                "```Java\n"
                "[Java code generated by following the given instructions]\n"
                "```\n\n"
                "The JSON object containing meta data of the Java Code must follow this exact format:\n\n"
                "{\n"
                '  "Bug_Explanation": "[explanation of how the bug was embedded in the generated code]",\n'
                '  "Buggy_Line": "[digit of the exact line numbers containing the bug should be outputed in a JSON list (verify the digits to ensure precision)]"\n'
                "}\n\n"
            )

    # Model is called with the appropriate message
    raw_model_response = query_loaded_model(gen_seed_msg, pipe)

    print("---------------------------------------------------Beginning-------------------------------------------------------------------")
    print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
    print(f"------------------------------------------------------End-1------------------------------------------------------------------\n")

    # Result is processed and the code is stored in a Java file withe appropriate name
    process_result = process_model_response(raw_model_response, response_index, title, description)
    process_json_response(raw_model_response, response_index, title, description)

    if process_result == 0:
        file_and_code_present = 0
        print("Issue with extraction of Java code")
        return file_and_code_present, success_compilation_counter, compilation_status

    # The java code is compiled with the compilation result status stored in that variable
    compilation_status = compile_java_code(response_index)  
    

    if compilation_status.returncode != 0:
        print(f"Compilation failed: Here are the error detail\n{compilation_status.stderr}")
        
        
        n = 3
        for compile_index in range(2,n+1):
            java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
            if not os.path.exists(java_file_name):
                file_and_code_present = 0
                print("Issue with extraction of Java code")
                return file_and_code_present, success_compilation_counter, compilation_status
            java_code = java_file_reader(java_file_name)
            actual_class_name = get_java_class_name(java_file_name, response_index)
            
            compilation_error = compilation_status.stderr

            if "springframework" in compilation_error:
                file_name = f"seed_{tool.title()}_{response_index}.java"
                maven_compile_result = build_maven(java_file_name, file_name, response_index, actual_class_name)
                if "ERROR" not in maven_compile_result.stdout:
                    print(f"Compilation in mavan succeeded!\n MAVEN BUILD result: {maven_compile_result.stdout}\n") 
                    success_compilation_counter = success_compilation_counter + 1
                    compilation_status = maven_compile_result
                    return file_and_code_present, success_compilation_counter, compilation_status
                else:
                    pattern = rf"^\[ERROR\].*result_{tool}_"
                    filtered_error_lines = [line for line in maven_compile_result.stdout.split("\n") if re.search(pattern, line)]
                    compilation_error = "\n".join(filtered_error_lines)
                    print(f"MAVEN BUILD Failed: \n{compilation_error}\n")
            
            regen_seed_msg = (
                "You are a Java programmer fixing compilation errors while preserving intentional bugs. "
                "Review the code and error below, then provide a compilable version that keeps the intended bug intact. "
                "Ensure that the meta data JSON object form is filled out for every generated Java code. "
                "IMPORTANT: Focus on removing non-essential imports that may cause compilation errors.\n"
                "\n"
                "Input Code and Errors:\n"
                f"Original Code:\n{java_code}\n"
                f"Compilation Error:\n{compilation_error}\n"
                f"Bug Rule: {title}\n"
                f"Description: {description}\n"
                "\n"
                "Import Requirements (STRICT):\n"
                "1. Use ONLY java.* and javax.* packages by default\n"
                "2. Additional imports are allowed ONLY if they are:\n"
                "   - Explicitly mentioned in the bug rule or description\n"
                "   - Absolutely necessary to demonstrate the specific bug\n"
                "3. DO NOT include imports for:\n"
                "   - General utility functions that can be written in standard Java\n"
                "   - External libraries unless specifically required by the bug\n"
                "   - Framework-specific packages (Android, Google libraries, etc.) unless the bug is about that framework\n"
                "4. If in doubt, implement the functionality using standard Java instead of importing\n"
                "\n"
                "Core Requirements:\n"
                "1. Fix ONLY the compilation errors\n"
                "2. Keep the intentional bug described in the rule\n"
                f"3. The fixed code MUST maintain this comment '// BUG: {title}' as a suffix on the exact line or lines containing the bug\n"
                "4. Add a public method named `showBug` that can be called from an outside file to demonstrate the bug. If the method uses data like"
                " arrays or other values, then these values should be passed as input parameters."
                "5. The `showBug` method should return the value(s) generated by the buggy code. If there are multiple use cases where the bug occurs,"
                " you may create multiple methods like `showBug1`, `showBug2`, etc.\n"
                "\n"
                "Code Structure Requirements:\n"
                "1. The entire code must be in one file\n"
                "2. Do NOT use 'Test' or 'test' in class names (unless it's a JUnit test)\n"
                "3. Ensure all objects and methods are properly declared\n"
                "4. If using inheritance, include all required implementations\n"
                "\n"
                "Error Resolution Strategy:\n"
                "1. For import-related errors, only keep imports that are directly related to demonstrating the bug\n"
                "2. For 'package does not exist' errors, remove the import and rewrite the code without that dependency\n"
                "\n"
                "Additional Constraints:\n"
                "1. Do NOT fix the intentional bug\n"
                "2. Prefer standard Java implementations over external libraries\n"
                "\n"
                "Format your response as follows:\n"
                "1. Provide the fixed Java code enclosed in triple backticks\n"
                "2. Fill out the JSON object form to provide meta data of the code and the bug (verify JSON format to ensure accuracy)\n"
                "3. The JSON object output must be enclosed in triple backticks\n"
                "4. List and justify any non-standard imports (if used)\n"
                "5. List all compilation errors found\n"
                "6. Explain your fixes, especially import-related changes\n"
                "The following section outlines the format of output the generated Java code:\n\n"
                "```Java\n"
                "[Java code generated by following the given instructions]\n"
                "```\n\n"
                "The JSON object containing meta data of the Java Code must follow this exact format:\n\n"
                "{\n"
                '  "Bug_Explanation": "[explanation of how the bug was embedded in the generated code]",\n'
                '  "Buggy_Line": "[digit of the exact line numbers containing the bug should be outputed in a JSON list (verify the digits to ensure precision)]"\n'
                "}\n\n"
            )

            raw_model_response = query_loaded_model(regen_seed_msg, pipe)

            # Result is processed and the code is stored in a Java file withe appropriate name
            process_result = process_model_response(raw_model_response, response_index, title, description)
            process_json_response(raw_model_response, response_index, title, description)

            if process_result == 0:
                file_and_code_present = 0
                print("Issue with extraction of Java code")
                return file_and_code_present, success_compilation_counter, compilation_status

            print("---------------------------------------------------Beginning-------------------------------------------------------------------")
            print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
            print(f"------------------------------------------------------End-{compile_index}------------------------------------------------------------------\n")

            # Save the content of the original java file in the appropriate file name - so that it can be compile successfully
          
            # The java code is compiled with the compilation result status stored in that variable
            compilation_status = compile_java_code(response_index)  

            if compilation_status.returncode == 0:
                success_compilation_counter = success_compilation_counter + 1  
                print(f"Compilation succeeded attempt: {compile_index}") 
                # print(f"Current number of successful compilations: {success_compilation_counter}")
                return file_and_code_present, success_compilation_counter, compilation_status
            else:
                print(f"Failure occured with this compilation error: \n{compilation_status.stderr}")

    if compilation_status.returncode != 0:

        # Model is called with the appropriate message
        raw_model_response = query_loaded_model(gen_seed_msg, pipe)
        print("---------------------------------------------------Beginning-------------------------------------------------------------------")
        print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
        print(f"----------------------------------------------------End-4------------------------------------------------------------------\n")


        # Result is processed and the code is stored in a Java file withe appropriate name
        process_result = process_model_response(raw_model_response, response_index, title, description)
        process_json_response(raw_model_response, response_index, title, description)

        if process_result == 0:
            file_and_code_present = 0
            print("Issue with extraction of Java code")
            return file_and_code_present, success_compilation_counter, compilation_status

        # The java code is compiled with the compilation result status stored in that variable
        compilation_status = compile_java_code(response_index)   

        if compilation_status.returncode != 0:
            
            m = 6
            for compile_index in range(5, m+1):
                java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
                if not os.path.exists(java_file_name):
                    file_and_code_present = 0
                    print("Issue with extraction of Java code")
                    return file_and_code_present, success_compilation_counter, compilation_status

                java_test_code = java_file_reader(java_file_name)
                actual_class_name = get_java_class_name(java_file_name, response_index)

                compilation_error = compilation_status.stderr

                if "springframework" in compilation_error:
                    file_name = f"seed_{tool.title()}_{response_index}.java"
                    maven_compile_result = build_maven(java_file_name, file_name, response_index, actual_class_name)
                    if "ERROR" not in maven_compile_result.stdout:
                        print(f"Compilation in mavan succeeded!\n MAVEN BUILD result: \n{maven_compile_result.stdout}\n") 
                        success_compilation_counter = success_compilation_counter + 1
                        compilation_status = maven_compile_result
                        return file_and_code_present, success_compilation_counter, compilation_status
                    else:
                        pattern = rf"^\[ERROR\].*result_{tool}_"
                        filtered_error_lines = [line for line in maven_compile_result.stdout.split("\n") if re.search(pattern, line)]
                        compilation_error = "\n".join(filtered_error_lines)
                        print(f"MAVEN BUILD Failed: \n{compilation_error}\n")

                raw_model_response = query_loaded_model(regen_seed_msg, pipe)

                print("---------------------------------------------------Beginning-------------------------------------------------------------------")
                print(f"What you are about to see is the respones from the Model:\n{raw_model_response}")
                print(f"------------------------------------------------------End-{compile_index}-------------------------------------------------------------------\n")

                # Result is processed and the code is stored in a Java file withe appropriate name
                process_result = process_model_response(raw_model_response, response_index, title, description)
                process_json_response(raw_model_response, response_index, title, description)

                if process_result == 0:
                    file_and_code_present = 0
                    print("Issue with extraction of Java code")
                    return file_and_code_present, success_compilation_counter, compilation_status

                # The java code is compiled with the compilation result status stored in that variable
                compilation_status = compile_java_code(response_index)  

                if compilation_status.returncode == 0:
                    print(f"Compilation of regenerated code succeeded on attempt: {compile_index}") 
                    success_compilation_counter = success_compilation_counter + 1
                    return file_and_code_present, success_compilation_counter, compilation_status
                else: 
                    print(f"Compilation of regenereate code attempt {compile_index} failed!")
        else:
            print(f"Compilation succeeded!") 
            success_compilation_counter = success_compilation_counter + 1
            return file_and_code_present, success_compilation_counter, compilation_status
    else:
        print(f"Compilation succeeded!") 
        success_compilation_counter = success_compilation_counter + 1

    return file_and_code_present, success_compilation_counter, compilation_status

def read_data_json_file(file_path):

    with open(file_path, 'r', encoding='utf-8') as file:
        data = json.load(file)

    return data

def write_json_file(file_path, json_content):
    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(json_content, f, indent=2)

    print("\nDone successfully updating JSON file\n")
if __name__ in "__main__":

    pipe = get_pipe(model)
    
    # Load in the list of rules from the input JSON file
    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")

    success_compilation_counter = 0
    compilation_proceeded = None

    response_index = 1
    for title, description in list_of_pairs:

        print(f"Start operating on this folder==============================Result_{tool.title()}_{response_index}===============================================================\n")

        # Initialize the Java code and Java test code names
        java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        json_file_path =  f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"

        if os.path.exists(java_file_name) and os.path.exists(json_file_path):
            compile_response = compile_java_code(response_index)

            if compile_response.returncode == 0:
                success_compilation_counter = success_compilation_counter + 1
                print("Compilation succeeded!")

                Compilation_Status = {
                    "Seed_Compilation_Status": "Successful"
                }
                json_data = read_data_json_file(json_file_path)
                json_data.update(Compilation_Status)
                write_json_file(json_file_path, json_data)  

                remove_compiled_classes(response_index)
                print(f"Current Compilation Success Counter: {success_compilation_counter}")
                print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")                     
                response_index = response_index + 1
                continue
        
        compilation_proceeded = process_compilation(title, description, java_file_name, response_index, success_compilation_counter, pipe)

        if os.path.exists(json_file_path) and os.path.exists(json_file_path):
            if compilation_proceeded[2] is None:
                print("skipping - invalid compilation results")
                print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
                response_index = response_index + 1
                continue
           
            if compilation_proceeded[2].returncode == 0:
                Compilation_Status = {
                    "Seed_Compilation_Status": "Successful"
                }

                json_data = read_data_json_file(json_file_path)
                json_data.update(Compilation_Status)
                write_json_file(json_file_path, json_data) 
            else:
                Compilation_Status = {
                    "Seed_Compilation_Status": "Failed",
                    "Seed_Compilation_Fail_Details": f"{compilation_proceeded[2].stderr}"
                }
                
                json_data = read_data_json_file(json_file_path)
                json_data.update(Compilation_Status)
                write_json_file(json_file_path, json_data) 
        else:
            print("No JSON data file for the seed code")

        success_compilation_counter =  compilation_proceeded[1]

        if compilation_proceeded[0] == 0:
            remove_compiled_classes(response_index)
            success_compilation_counter = compilation_proceeded[1]
            print(f"Current Compilation Success Counter: {success_compilation_counter}")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
            response_index = response_index + 1
            continue

        remove_compiled_classes(response_index)

        print(f"Current Compilation Success Counter: {success_compilation_counter}")
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
        response_index = response_index + 1
print(f"Total number of successful compilation: {success_compilation_counter}")