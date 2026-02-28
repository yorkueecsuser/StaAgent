import os
import re
import gc
import subprocess
from transformers import pipeline
from llm_utils import get_pipe
import torch
from utils import get_arg_value, read_rule_file_as_pairs, read_data_json_file, write_json_file, TOOL_RULE_COUNTS

tool = get_arg_value('--tool')
model = get_arg_value('--model')
file_count = TOOL_RULE_COUNTS[tool]

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

def java_file_writer(file_name, java_file_content):
    with open(file_name, "w", encoding="utf-8") as file:
        file.write(java_file_content)

    print("\nDone successfully updating JAVA file\n")

def query_loaded_model(prompt_input_list, pipe: pipeline):
    """Generates high-quality Java code from the loaded model given an input prompt."""

    chats = [[{"role": "user", "content": prompt_input}] for prompt_input in prompt_input_list]

    output_list = []
    BATCH_SIZE=16
    prompt_batches = [chats[i:i+BATCH_SIZE] for i in range(0, len(chats), BATCH_SIZE)]
    for item in prompt_batches:
        try:
            output_list.extend(pipe(item, max_new_tokens=2048, batch_size=BATCH_SIZE))
        except Exception as oom:
            print(f"OOM with batch_size: {BATCH_SIZE}")
            torch.cuda.empty_cache()
            gc.collect()
            REDUCED_BATCH_SIZE=8
            for rep_chat_batch in [item[j:j+REDUCED_BATCH_SIZE] for j in range(0, len(item), REDUCED_BATCH_SIZE)]:
                try:
                    output_list.extend(pipe(rep_chat_batch, max_new_tokens=2048, batch_size=REDUCED_BATCH_SIZE))
                except Exception as oom2:
                    print(f"OOM with batch_size: {REDUCED_BATCH_SIZE}")
                    torch.cuda.empty_cache()
                    gc.collect()
                    REDUCED_BATCH_SIZE=4
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

def compile_java_code(file_name):
    javac_command = f"timeout 5s javac -encoding UTF-8 -cp \".:{os.environ['SASTTOOL_PROJECT_DIR']}/lib/*\" {file_name}"

    javac_compile_result = subprocess.run(javac_command, shell=True, capture_output=True, text=True)
    
    return javac_compile_result

def remove_compiled_classes(response_index):
    delete_class_cmd_lnx = f"rm -rf {tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/*.class"
    os.system(delete_class_cmd_lnx)
    print("Removed all the .class files successfully.")

def update_json_file(json_file_data_name, json_content):
    current_json = read_data_json_file(json_file_data_name)
    current_json.update(json_content)
    write_json_file(json_file_data_name, current_json)

def process_model_response(llm_output):

    regex1 = r"```Java(.*?)```"
    regex2 = r"```java(.*?)```"
    regex3 = r"```JAVA(.*?)```"
    java_code_match = re.search(regex1, llm_output, re.DOTALL) or re.search(regex2, llm_output, re.DOTALL)  or re.search(regex3, llm_output, re.DOTALL) 

    bool = 1

    final_java_code = ""

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
      
        bool = 1
        return final_java_code, bool
        
    else:

        print(f"Error: No Java code found in the input file")
        bool = 0
        return final_java_code, bool

def get_prompt_by_mutation_op(op_key, op_value, java_code, rule):
    prompt = (
        "Your task is to strictly UPDATE the provided Java code with mutants (add java code based on the description of the provided Mutation Operator Information)."
        "The given Java code contains a bug as described below. DO NOT remove or fix the bug. The mutated code MUST still contain the bug.\n"
        f"Bug Rule: {rule[0]}\n"
        f"Bug Description: {rule[1]}\n"
        "Ensure that the mutated Java code adheres to the Mutation Operator described below."
        "\n"
        f"Java code: \n{java_code}\n"
        f"Mutation Operator name: {op_key}\n"
        f"Mutation Operator description: {op_value}"
        "\n"
    )
    if op_key == "Equivalent Loop Replacement":
        prompt = prompt + (
            "Core Requirements:\n"
            "1. Replace a loop with equivalent do-while. If there are no loops in the given code, DO NOT make any change and return the code as is.\n"
            "2. Generated mutated Java code MUST maintain the original bug in the code. You MUST NOT fix the bug in the code.\n"
        )
    else:
        prompt = prompt + (
            "Core Requirements:\n"
            "1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).\n"
            "2. Generated mutated Java code MUST maintain the original bug in the code. DO NOT remove or fix the bug.\n"
        )
    prompt = prompt + (
        "3. Generated mutated Java code MUST compile successfully.\n"
        "4. Mutant code being added MUST be unique not generic.\n"
        "5. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.\n"
        "6. Generated mutated Java code MUST avoid unreachable statement error.\n" 
        "\n"
    )
    if "Unreachable" in op_key:
        prompt = prompt + (
            "\nSTRICTLY follow these guidelines to AVOID unreachable statement errors:\n\n"
            "1. **If Statements**: NEVER use compile-time constants like `false` directly. Instead, use a non-final variable or an equivalent method call.\n"
            "   Correct: `boolean condition = getCondition(); if (condition) { /* code */ }`\n"
            "   Incorrect: `if (false) { /* code */ }`\n\n"
            "2. **While Loops**: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.\n"
            "   Correct: `boolean conditionWhile = getCondition(); while (conditionWhile) { /* code */ }`\n"
            "   Incorrect: `while (false) { /* code */ }`\n\n"
            "3. **For Loops**: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.\n"
            "   Correct: `boolean conditionFor = getCondition(); for (int i = 0; conditionFor; i++) { /* code */ }`\n"
            "   Incorrect: `for (int i = 0; false; i++) { /* code */ }`\n\n"
            "4. **If-Else Statements**: Do NOT use compile-time constants like `false` directly in conditions, especially if they make an entire branch unreachable.\n"
            "   Correct: `boolean shouldRun = getCondition(); if (shouldRun) { /* code */ } else { /* alternative code */ }`\n"
            "   Incorrect: `if (false) { /* code */ } else { /* code */ }`\n\n"
            "5. **Switch Statements**: NEVER use compile-time constants directly for the switch expression. Instead, use a non-final variable or an equivalent method call.\n"
            "   Correct: `int value = getValue(); switch(value) { case 1: /* code */ break; }`\n"
            "   Incorrect: `switch (0) { case 1: /* code */ break; }`\n\n"
            "6. **General Rule**: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.\n"
        )
    if "Renaming" == op_key:
        prompt = prompt + (
            "\nIf the bug rule is about specific variable/identifier name, then you MUST not rename the variable/identifier that demonstrate the bugs. "
            "Instead you should rename other variables/identifiers that are not directly related to the bug rule."
            "For example: if a bug rule says variable names cannot be `assert`, then do not rename the `assert` variable, instead rename other variables.\n"
        )
    prompt = prompt + (
        "\n"
        "Format your response as follows:\n"
        "1. Provide the Java code enclosed in triple backticks\n"
        "The following section outlines the format of output the generated Java code:\n\n"
        "```Java\n"
        "[Insert Java code generated by following the given mutation informaiton and other instructions]\n"
        "```\n\n"
    )
    return prompt

def model_generate_mutant(mutation_prompt_list, mutation_metadata_list):
    correct_compile_cnt = 0

    raw_response_list = query_loaded_model(mutation_prompt_list, pipe)
    print(f"total raw response for {mutation_metadata_list[0]["response_index"]}: {len(raw_response_list)}")

    for i, raw_response in enumerate(raw_response_list):
        mutation_metadata = mutation_metadata_list[i]
        op_num = mutation_metadata["op_num"]
        response_index = mutation_metadata["response_index"]
        mutant_index = mutation_metadata["mutant_index"]

        mutated_java_code = process_model_response(raw_response)[0]

        mutant_java_filepath = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/mutant_{mutant_index}_{op_num}.java"
        if not os.path.exists(os.path.dirname(mutant_java_filepath)):
            os.makedirs(os.path.dirname(mutant_java_filepath), exist_ok=True)

        java_file_writer(mutant_java_filepath, mutated_java_code)
        compilation_result = compile_java_code(mutant_java_filepath)

        if compilation_result.returncode != 0:
            correct_compile_cnt += 1
            json_result = {
                f"Mutant_{mutant_index}_{op_num}_Generated" : "Yes",
                f"Mutant_{mutant_index}_{op_num}_Compile_Status": "No",
                f"Mutant_{mutant_index}_{op_num}_Error_Details": f"{compilation_result.stderr}" 
            }
        else:
            json_result = {
                f"Mutant_{mutant_index}_{op_num}_Generated" : "Yes",
                f"Mutant_{mutant_index}_{op_num}_Compile_Status": "Yes"
            }
        json_filepath = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
        mutant_json = {}
        if os.path.exists(json_filepath):
            update_json_file(json_filepath, json_result)
        else:
            os.makedirs(os.path.dirname(json_filepath), exist_ok=True)
            mutant_json.update(json_result)
            write_json_file(json_filepath, mutant_json)
        
    return correct_compile_cnt

if __name__ in "__main__":

    pipe = get_pipe(model)

    op_list = read_data_json_file("agents/mutation_operators.json")

    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")

    response_index = 1
    compilation_success_status = 1 #If this eventually set to 0 Then compilation was successful
    compilation_success_counter = 0 #This count is incremented af the final mutant code is generated - If the final code compiles then it's incremented by 1

    for bug in range(file_count):

        current_rule = list_of_pairs[response_index - 1]

        java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        json_file_data_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
        if not os.path.exists(java_file_name):
            java_file_name = f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}_junit_test.java"
            if not os.path.exists(java_file_name):
                response_index += 1
                print(f"Skipping. file not found: seed_{tool.title()}_{response_index}.java and seed_{tool.title()}_{response_index}_junit_test.java")
                continue

        java_code = java_file_reader(java_file_name)

        print(f"Start operating on this folder==============================result_{tool.title()}_{response_index}==================================================================\n")
        if os.path.exists(java_file_name):
            if os.path.exists(json_file_data_name):
                current_json = read_data_json_file(json_file_data_name)
                if not ("Bug_Triggered" in current_json and current_json["Bug_Triggered"] == "Yes"):
                    print(f"Skipping. 'Bug_Triggered' not 'Yes' for: {json_file_data_name}")
                    response_index += 1
                    continue
            else:
                print(f"Skipping. No JSON Data found for: {json_file_data_name}")
                response_index += 1
                continue
            
            mutation_prompt_list = []
            mutation_metadata_list = []
            for op_num, op_dets in op_list.items():
                op_key, op_value = op_dets["name"], op_dets["description"]
                N = 3 # The number of mutants that are generated
                for i in range(1, N+1):
                    if os.path.exists(f"{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/mutant_{i}_{op_num}.java"):
                        print(f"Skipping------{tool}_clean_java_code_{model}/result_{tool.title()}_{response_index}/mutant_{i}_{op_num}.java-----It already exists")
                        continue
                    mutation_prompt_list.append(get_prompt_by_mutation_op(op_key, op_value, java_code, current_rule))
                    mutation_metadata_list.append(dict(
                        response_index=response_index,
                        op_num=op_num,
                        mutant_index=i
                    ))
            if mutation_prompt_list and mutation_metadata_list:
                correct_compile_cnt = model_generate_mutant(mutation_prompt_list, mutation_metadata_list)

                compilation_success_counter += correct_compile_cnt
                print(f"Number of mutants that compile successfully {compilation_success_counter}.")
            else:
                print(f"Skipped {java_file_name}. All mutant generated already.")
        else:
            print(f"No file with name seed_{tool.title()}_{response_index}.java found: No mutant generated.")
            response_index += 1
            continue
    
        remove_compiled_classes(response_index)
        print(f"End of working on this folder===============================Result_{tool.title()}_{response_index}===============================================================\n\n")
        response_index = response_index + 1

    print(f"Total number of generated mutate java classes that compiled successfully: {compilation_success_counter}")