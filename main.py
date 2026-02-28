import subprocess
import argparse
import time
import json
import os

# uncomment these two lines for models that require HF_TOKEN
# with open("creds/hf_access_token.json", "r") as f:
#     os.environ['HF_TOKEN'] = json.load(f)["hf_token"]

parser = argparse.ArgumentParser(description="Run SAST tool with specified model and tool.")
parser.add_argument('--model', type=str, default='qwen', choices=['codestral', 'deepseek', 'qwen'], help='Model to use (default: qwen)')
parser.add_argument('--tool', type=str, default='spotbugs', choices=['infer', 'pmd', 'prone', 'sonar', 'spotbugs'], help='SAST tool to use (default: spotbugs)')
args = parser.parse_args()

original_dir = os.path.dirname(os.path.abspath(__file__))
os.environ['SASTTOOL_PROJECT_DIR'] = original_dir

# run seed gen code
seed_gen_start = time.time()
print(f"started Seed Gen at {seed_gen_start}")
os.makedirs(f'{args.tool}_clean_java_code_{args.model}')
with open(f'{args.tool}_clean_java_code_{args.model}/output-cg-{args.tool}.txt', 'a') as cg_file:
    result = subprocess.run(['python', '-u', 'agents/llmcodegenerator.py', '--model', args.model, '--tool', args.tool], stdout=cg_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running llmcodegenerator.py: {result.stderr.decode()}")
    cg_file.flush()

result = subprocess.run(['python', '-u', 'linecounter.py', '--model', args.model, '--tool', args.tool], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
if result.returncode != 0:
    print(f"Error running linecounter.py: {result.stderr.decode()}")
print(f"{"="*5}Finished running SEED Code generation in {time.time() - seed_gen_start} seconds{"="*5}\n\n")

# run test gen code
seed_test_start = time.time()
print(f"started Seed Test at {seed_test_start}")
with open(f'{args.tool}_clean_java_code_{args.model}/output-tg-{args.tool}.txt', 'a') as tg_file:
    result = subprocess.run(['python', '-u', 'agents/llmbugtestgenerator.py', '--model', args.model, '--tool', args.tool], stdout=tg_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running llmbugtestgenerator.py: {result.stderr.decode()}")
    tg_file.flush()
print(f"{"="*5}Finished running TEST Code generation in {time.time() - seed_test_start} seconds{"="*5}\n\n")

# run seed validation code
seed_val_start = time.time()
print(f"started Seed Validation at {seed_val_start}")
with open(f'{args.tool}_clean_java_code_{args.model}/output-val-{args.tool}.txt', 'a') as val_file:
    result = subprocess.run(['python', '-u', 'agents/llmvalidatetest.py', '--model', args.model, '--tool', args.tool], stdout=val_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running llmvalidatetest.py: {result.stderr.decode()}")
    val_file.flush()
print(f"{"="*5}Finished running Test Code VALIDATION in {time.time() - seed_val_start} seconds{"="*5}\n\n")

# run mutant gen code
mutant_gen_start = time.time()
print(f"started Mutant Gen at {mutant_gen_start}")
with open(f'{args.tool}_clean_java_code_{args.model}/output-mg-{args.tool}.txt', 'a') as mg_file:
    result = subprocess.run(['python', '-u', 'agents/llmgeneratemutant.py', '--model', args.model, '--tool', args.tool], stdout=mg_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running llmgeneratemutant.py: {result.stderr.decode()}")
    mg_file.flush()
print(f"{"="*5}Finished running MUTANT Code generation in {time.time() - mutant_gen_start} seconds{"="*5}\n\n")

# run mutant test code
mutant_test_start = time.time()
print(f"started Mutant Test at {mutant_test_start}")
with open(f'{args.tool}_clean_java_code_{args.model}/output-mt-{args.tool}.txt', 'a') as mt_file:
    result = subprocess.run(['python', '-u', 'agents/llmtestmutants.py', '--model', args.model, '--tool', args.tool], stdout=mt_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running llmtestmutants.py: {result.stderr.decode()}")
    mt_file.flush()
print(f"{"="*5}Finished running MUTANT Code TEST in {time.time() - mutant_test_start} seconds{"="*5}\n\n")

# run mutant validation code
mutant_val_start = time.time()
print(f"started Mutant Validation at {mutant_val_start}")
with open(f'{args.tool}_clean_java_code_{args.model}/output-mv-{args.tool}.txt', 'a') as mv_file:
    result = subprocess.run(['python', '-u', 'agents/validate_mutants.py', '--model', args.model, '--tool', args.tool], stdout=mv_file, stderr=subprocess.PIPE)
    if result.returncode != 0:
        print(f"Error running validate_mutants.py: {result.stderr.decode()}")
    mv_file.flush()
print(f"{"="*5}Finished running MUTANT Code VALIDATION in {time.time() - mutant_val_start} seconds{"="*5}\n\n")

print(f"Total process finished in {time.time() - seed_gen_start} seconds")
os.environ.pop("SASTTOOL_PROJECT_DIR", None)