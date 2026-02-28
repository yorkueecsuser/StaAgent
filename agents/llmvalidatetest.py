import json
import re
import os
from transformers import pipeline
from llm_utils import get_pipe
from utils import get_arg_value, read_rule_file_as_pairs, read_data_json_file, write_json_file

tool = get_arg_value('--tool')
model = get_arg_value('--model')

def query_loaded_model(prompt_input, pipe: pipeline):
    """Generates high-quality Java code from the loaded model given an input prompt."""

    chats = [{"role": "user", "content": prompt_input}]
    output = pipe(chats, max_new_tokens=1024, batch_size=5)

    return output[0]["generated_text"][-1]['content']

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def process_update_json_response(json_file_path, raw_response):
    pattern1 = r'```JSON\s*(\{[\s\S]*?\})\s*```'
    pattern2 = r'```json\s*(\{[\s\S]*?\})\s*```'
    pattern3 = r'```Json\s*(\{[\s\S]*?\})\s*```'
    pattern4 = r'```\s*(\{[\s\S]*?\})\s*```'
    pattern5 = r'(\{\s*\n\s*".*?\n\})'
    pattern6 = r'(\{[\s\S]*?\})'  
    
    patterns = [pattern1, pattern2, pattern3, pattern4, pattern5, pattern6]

    filtered_new_data = {}

    for pattern in patterns:
        match = re.search(pattern, raw_response)
        if match:
            try:
                new_json_str = match.group(1)
                
                new_data = json.loads(new_json_str)

                current_json = read_data_json_file(json_file_path)

                if "Bug_Triggered" in new_data:
                    filtered_new_data["Bug_Triggered"] = new_data["Bug_Triggered"]

                if "Bug_Trigger_Explanation" in new_data:
                    filtered_new_data["Bug_Trigger_Explanation"] = new_data["Bug_Trigger_Explanation"]

                if "Test_Run_Result" in new_data:
                    filtered_new_data["Test_Run_Result"] = new_data["Test_Run_Result"]

                filtered_new_data = {k: v for k, v in filtered_new_data.items() if v is not None}

                current_json.update(filtered_new_data)

                write_json_file(json_file_path, current_json)

                print("Successful: Completed JSON file update")
                
            except json.JSONDecodeError as e:
                print("Something went wrong while attempting to update the JSON file:", str(e))

def process_validation(title, description, java_file_name, java_test_file_name, response_index, pipe, json_data, java_code, java_test_code):

    # Assumption: Trigger line could be missing but JUNIT result is mandatory
    if "Test_Run_Result" in json_data:
        junit_run_result =  json_data["Test_Run_Result"]
        
        if "Trigger_Line" in json_data:
            trigger_lines = json_data["Trigger_Line"]  
        else: 
            trigger_lines = [] 

        print(f"Here is the Test Run result:\n {junit_run_result}")

        bug_report_msg = (
            "Your task is ANALYZE the details below to determine if the Test Run Results CONFIRM the presence of the described bug in the Java code. "
            "Evaluate: bug information, Java code, test code, and the specific trigger lines.\n\n "
            
            "===== REQUIRED OUTPUT FORMAT =====\n\n"
            "YOUR RESPONSE MUST BE EXACTLY THIS JSON STRUCTURE:\n"
            "```JSON\n"
            "{\n"
            '  "Bug_Triggered": "[ONLY Yes OR No]",\n'
            '  "Bug_Trigger_Explanation": "[explanation based on the bug information, java code, and Test Run Results evidence]"\n'
            "}\n"
            "```\n\n"

            "===== INPUT DATA =====\n\n"
            "Bug Information:\n"
            f"- Bug Rule: {title}\n"
            f"- Bug Description: {description}\n\n"

            "Code Implementation:\n"
            f"- Java Code:\n{java_code}\n\n"

            "Test Implementation:\n"
            f"- Java Test Code:\n{java_test_code}\n"
            f"- Lines in Java Test Code that should trigger the bug:\n{trigger_lines}\n\n"

            "Test Execution Results:\n"
            f"- Test Run Results:\n{junit_run_result}\n\n"

            "===== CRITICAL REQUIREMENTS =====\n\n"
            "1. OUTPUT MUST BE VALID JSON in the exact format shown above.\n"
            "2. The JSON object is the only permitted output. Do not output any additional comments, notes or commentary outside of the JSON object.\n"
            "3. JSON MUST be enclosed in triple backticks (```) as shown in the provided JSON structure.\n"
            "4. Analysis MUST be based SOLELY on the provided test results.\n"
            "5. \"Bug_Triggered\" field MUST contain ONLY \"Yes\" or \"No\".\n"
            "6. \"Bug_Trigger_Explanation\" MUST explain whether test results CONFIRM bug triggering.\n\n"
            "Your analysis must focus on the given rule, code, and the test results to determine if the bug is present in the Java code."
        )

        print(f"Here prompt provided to the llm:\n {bug_report_msg}")

        raw_response = query_loaded_model(bug_report_msg, pipe)
        process_update_json_response(json_file_path, raw_response)

        print(f"\nThis is the raw bug report:{raw_response}\n")
    else:
        print(f"In the data was missing JUNIT result")

        tmp_json = {
            "Bug_Triggered": "N/A",
            "Bug_Trigger_Explanation": "Inconclusive: Missing Test run result"
        }

        json_data.update(tmp_json)

        write_json_file(json_file_path, json_data)

if __name__ in "__main__":

    pipe = get_pipe(model, temp=0.1)

    # Load in the list of rules from the input JSON file
    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")

    response_index = 1
    for title, description in list_of_pairs:

        print(f"Start operating on this folder==============================Result_{tool.title()}_{response_index}===============================================================\n")      

        # Initialize the Java code and Java test code names and json file
        java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
        json_file_path =  f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
          
        # Confirm that the Java class exists - If not then go to the next rule
        if not os.path.exists(java_file_name):
            java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}_junit_test.java"
            if not os.path.exists(java_file_name):
                print(f"NOTE: (No Seed file found) The following file does NOT exist seed_{tool.title()}_{response_index}.java")
                print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

                response_index = response_index + 1            

                continue

        if not os.path.exists(java_test_file_name):
            print(f"NOTE: (No Test file found) The following file does NOT exist test_{tool.title()}_{response_index}.java")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

            response_index = response_index + 1
            continue

        if not os.path.exists(json_file_path):
            print(f"NOTE: (No JSON file found) The following file does NOT exist data_{tool.title()}_{response_index}.json")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

            response_index = response_index + 1
            continue
       
        # Load in the java code, java test code and the json data files after checking if they exist
        java_code = java_file_reader(java_file_name)
        java_test_code = java_file_reader(java_test_file_name)
        json_data = read_data_json_file(json_file_path)

        if "Bug_Triggered" in json_data:
            print(f"Skipping validation - \"Bug_Triggered\" found in data_{tool.title()}_{response_index}.json - This rule HAS been validated")
            response_index = response_index + 1
            continue
            
        process_validation(title, description, java_file_name, java_test_file_name, response_index, pipe, json_data, java_code, java_test_code)
   
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
        response_index = response_index + 1

print(f"Done validation tasks!")