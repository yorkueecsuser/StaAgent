import sys
import json

TOOL_RULE_COUNTS = {
    "infer": 27,
    "pmd": 125,
    "prone": 177,
    "sonar": 173,
    "spotbugs": 199
}

def get_arg_value(flag):
    try:
        index = sys.argv.index(flag)
        return sys.argv[index + 1]
    except ValueError as e:
        raise ValueError(f"Flag '{flag}' not found in arguments") from e
    except IndexError as e:
        raise IndexError(f"No value provided for flag '{flag}'") from e

def read_rule_file_as_pairs(file_path):
    # Load the JSON file
    with open(file_path, 'r', encoding='utf-8') as file:
        data = json.load(file)
    
    # Extract each pair as a tuple and store in a list
    pairs = [(entry["title"], entry["description"]) for entry in data]

    return pairs

def read_data_json_file(file_path):
    # Load the JSON file
    with open(file_path, 'r', encoding='utf-8') as file:
        data = json.load(file)
    return data

def write_json_file(file_path, json_content):
    with open(file_path, "w", encoding="utf-8") as f:
        json.dump(json_content, f, indent=2)
