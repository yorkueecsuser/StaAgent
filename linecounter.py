from agents.utils import get_arg_value, read_rule_file_as_pairs
import json
import os

# tool = "pmd"
tool = get_arg_value("--tool")

# def read_json_file(file_path):
#     # Load the JSON file
#     with open(file_path, 'r', encoding='utf-8') as file:
#         data = json.load(file)
    
#     # Extract each pair as a tuple and store in a list
#     pairs = [(entry["title"], entry["description"]) for entry in data]

#     return pairs

def java_file_reader(file_name):
    with open(file_name, "r", encoding='utf-8') as file:
        java_code = file.read()
        
    return java_code

import re

def find_buggy_lines(java_file_path):
    buggy_lines = []
    
    with open(java_file_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    total_lines = len(lines)
    for i, line in enumerate(lines):

        if re.search(r'//\s*BUG', line, re.IGNORECASE):
            comment_index = line.find('//')
            code_before = line[:comment_index].strip()
            
            if code_before:
                buggy_lines.append(i + 1)
            else:
                next_code_line = None
                for j in range(i + 1, total_lines):
                    candidate = lines[j].strip()
                    if candidate and not candidate.startswith('//'):
                        next_code_line = j + 1
                        break
                if next_code_line:
                    buggy_lines.append(next_code_line)
    return list(set(buggy_lines))

def read_data_json_file(file_path):
    # Load the JSON file
    with open(file_path, 'r', encoding='utf-8') as file:
        data = json.load(file)

    return data

def write_json_file(file_path, json_content):
    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(json_content, f, indent=2)

    print("\nDone successfully updating JSON file\n")

if __name__ == "__main__":
    
    list_of_pairs = read_rule_file_as_pairs(f"Rules_List/{tool}_rules.json")
    
    response_index = 1 
    for title, description in list_of_pairs:
        if response_index < 46:
            response_index += 1
            continue
        
        json_file_path = f"{tool}_clean_java_code/result_{tool.title()}_{response_index}/data_{tool.title()}_{response_index}.json"
        java_file_path = f"{tool}_clean_java_code/result_{tool.title()}_{response_index}/seed_{tool.title()}_{response_index}.java"
        
        if os.path.exists(java_file_path):
            buggy_line = find_buggy_lines(java_file_path)
            
            result = {
                "Buggy_Line": buggy_line
            }
            
            if os.path.exists(json_file_path):
                current_json = read_data_json_file(json_file_path)
                
                current_json["Buggy_Line"] = result["Buggy_Line"]
                
                write_json_file(json_file_path, current_json)
            else:
                write_json_file(json_file_path, result)
            
            print("Successful: Completed JSON file update")
        
        response_index = response_index + 1
        