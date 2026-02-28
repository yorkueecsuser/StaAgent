import json
import re
import gc
import os
import glob
from transformers import pipeline
from llm_utils import get_pipe
import torch
from utils import get_arg_value, read_rule_file_as_pairs, read_data_json_file, write_json_file

tool = get_arg_value('--tool')
model = get_arg_value('--model')

def query_loaded_model(prompt_input_list, pipe: pipeline):
    """Generates high-quality Java code from the loaded model given an input prompt."""

    chats = [[{"role": "user", "content": prompt_input}] for prompt_input in prompt_input_list]

    output_list = []
    BATCH_SIZE=24
    prompt_batches = [chats[i:i+BATCH_SIZE] for i in range(0, len(chats), BATCH_SIZE)]
    for item in prompt_batches:
        try:
            output_list.extend(pipe(item, max_new_tokens=2048, batch_size=BATCH_SIZE))
        except Exception as oom:
            print(f"OOM with batch_size: {BATCH_SIZE}")
            torch.cuda.empty_cache()
            gc.collect()
            REDUCED_BATCH_SIZE=16
            for rep_chat_batch in [item[j:j+REDUCED_BATCH_SIZE] for j in range(0, len(item), REDUCED_BATCH_SIZE)]:
                try:
                    output_list.extend(pipe(rep_chat_batch, max_new_tokens=2048, batch_size=REDUCED_BATCH_SIZE))
                except Exception as oom2:
                    print(f"OOM with batch_size: {REDUCED_BATCH_SIZE}")
                    torch.cuda.empty_cache()
                    gc.collect()
                    REDUCED_BATCH_SIZE=8
                    for rep_chat in [rep_chat_batch[j:j+REDUCED_BATCH_SIZE] for j in range(0, len(rep_chat_batch), REDUCED_BATCH_SIZE)]:
                        try:
                            output_list.extend(pipe(rep_chat, max_new_tokens=2048, batch_size=REDUCED_BATCH_SIZE))
                        except Exception as oom3:
                            print(f"OOM with batch_size: {REDUCED_BATCH_SIZE}")
                            torch.cuda.empty_cache()
                            gc.collect()
                            REDUCED_BATCH_SIZE=1
                            for rep_chat_single in [rep_chat[j:j+REDUCED_BATCH_SIZE] for j in range(0, len(rep_chat), REDUCED_BATCH_SIZE)]:
                                output_list.extend(pipe(rep_chat_single, max_new_tokens=2048, batch_size=REDUCED_BATCH_SIZE))
    
    return [single_output[0]["generated_text"][-1]['content'] for single_output in output_list]

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def process_update_json_response(json_file_path, raw_response, mutant_filename_wo_ext):
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

                current_json = read_data_json_file(json_file_path)

                new_data = json.loads(new_json_str)

                if f"{mutant_filename_wo_ext}_Bug_Triggered" in new_data:
                    filtered_new_data[f"{mutant_filename_wo_ext}_Bug_Triggered"] = new_data[f"{mutant_filename_wo_ext}_Bug_Triggered"]

                if f"{mutant_filename_wo_ext}_Bug_Trigger_Explanation" in new_data:
                    filtered_new_data[f"{mutant_filename_wo_ext}_Bug_Trigger_Explanation"] = new_data[f"{mutant_filename_wo_ext}_Bug_Trigger_Explanation"]

                if f"{mutant_filename_wo_ext}_Test_Run_Result" in new_data:
                    filtered_new_data[f"{mutant_filename_wo_ext}_Test_Run_Result"] = new_data[f"{mutant_filename_wo_ext}_Test_Run_Result"]

                filtered_new_data = {k: v for k, v in filtered_new_data.items() if v is not None}

                current_json.update(filtered_new_data)

                write_json_file(json_file_path, current_json)

                print("Successful: Completed JSON file update")
            except Exception as e:
                print("Something went wrong while attempting to update the JSON file:", str(e))

def process_validation(title, description, mutant_file_list, java_test_file_name, response_index, pipe, json_data):

    java_test_code = java_file_reader(java_test_file_name)
    
    prompt_list = []
    mutant_file_name_list = []
    for mutant_file_name in mutant_file_list:
        
        mutant_filename_wo_ext = mutant_file_name.split("/")[-1].replace(".java", "").replace("mutant", "Mutant")
        java_code = java_file_reader(mutant_file_name)

        # Assumption: Trigger line could be missing but JUNIT result is mandatory
        if f"{mutant_filename_wo_ext}_Test_Run_Result" in json_data:
            junit_run_result =  json_data[f"{mutant_filename_wo_ext}_Test_Run_Result"]
            
            if f"{mutant_filename_wo_ext}_Trigger_Line" in json_data:
                trigger_lines = json_data[f"{mutant_filename_wo_ext}_Trigger_Line"]  
            else: 
                trigger_lines = [] 

            if len(junit_run_result) > 5000:
                junit_run_result = junit_run_result[:5000] + "\n[TRUNCATED: Test Run Result is too long to display in full]"
            print(f"Here is the Test Run result:\n {junit_run_result}")

            bug_report_msg = (
                "Your task is ANALYZE the details below to determine if the Test Run Results CONFIRM the presence of the described bug in the Java code. "
                "Evaluate: bug information, Java code, test code, and the specific trigger lines.\n\n "
                
                "===== REQUIRED OUTPUT FORMAT =====\n\n"
                "YOUR RESPONSE MUST BE EXACTLY THIS JSON STRUCTURE:\n"
                "```JSON\n"
                "{\n"
                f'  "{mutant_filename_wo_ext}_Bug_Triggered": "[ONLY Yes OR No]",\n'
                f'  "{mutant_filename_wo_ext}_Bug_Trigger_Explanation": "[explanation based on the bug information, java code, and Test Run Results evidence]"\n'
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
                f"5. \"{mutant_filename_wo_ext}_Bug_Triggered\" field MUST contain ONLY \"Yes\" or \"No\".\n"
                f"6. \"{mutant_filename_wo_ext}_Bug_Trigger_Explanation\" MUST explain whether test results CONFIRM bug triggering.\n\n"
                "Your analysis must focus on the given rule, code, and the test results to determine if the bug is present in the Java code."
            )
            prompt_list.append(bug_report_msg)
            mutant_file_name_list.append(mutant_filename_wo_ext)
        else:
            print(f"In the data was missing JUNIT result")
            tmp_json = {
                f"{mutant_filename_wo_ext}_Bug_Triggered": "N/A",
                f"{mutant_filename_wo_ext}_Bug_Trigger_Explanation": "Inconclusive: Missing Test run result"
            }

            json_data.update(tmp_json)

            write_json_file(json_file_path, json_data)

    raw_response_list = query_loaded_model(prompt_list, pipe)

    for idx, raw_response in enumerate(raw_response_list):
        process_update_json_response(json_file_path, raw_response, mutant_file_name_list[idx])
    

if __name__ in "__main__":

    pipe = get_pipe(model, temp=0.1)

    # Load in the list of rules from the input JSON file
    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")

    response_index = 1
    for title, description in list_of_pairs:

        print(f"Start operating on this folder==============================Result_{tool.title()}_{response_index}===============================================================\n")

        # Initialize the Java test code and the json file 
        java_test_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/test_{tool.title()}_{response_index}.java"
        json_file_path =  f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"

        if not os.path.exists(java_test_file_name):
            print(f"NOTE: (No Test file found) The following file does NOT exist test_{tool.title()}_{response_index}.java")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

            response_index = response_index + 1
            continue

           
        if not os.path.exists(json_file_path):
            print(f"NOTE: (No JSON file found) The following JSON file does NOT exist data_{tool.title()}_{response_index}.json")
            print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")

            response_index = response_index + 1
            continue

        try:
            json_data = read_data_json_file(json_file_path)
        except json.decoder.JSONDecodeError:
            response_index = response_index + 1
            continue

        # glob.glob returns an empty list if there are mutant java files found in the result_ folder - else it returns the list of java files 
        # in order words if there are no mutant java files then there is nothing to validate 
        process_validation(
            title,
            description,
            glob.glob(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/mutant_*.java"),
            java_test_file_name,
            response_index,
            pipe, 
            json_data
        )
   
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
        response_index = response_index + 1

print(f"Done validation tasks!")
