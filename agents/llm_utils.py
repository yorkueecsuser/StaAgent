import os
import torch
from transformers import AutoModelForCausalLM, AutoTokenizer, pipeline, BitsAndBytesConfig

AVAILABLE_MODELS = {
    "codestral": "mistralai/Codestral-22B-v0.1",
    "codellama": "meta-llama/CodeLlama-34b-Instruct-hf",
    "deepseek": "deepseek-ai/deepseek-coder-33b-instruct",
    "qwen": "Qwen/Qwen2.5-Coder-32B-Instruct"
}

def get_model_and_tokenizer(model_id: str):
    torch.cuda.empty_cache()

    # bnb_config = BitsAndBytesConfig(
    #     load_in_8bit=True,
    #     # bnb_4bit_quant_type="nf4",
    #     # bnb_4bit_compute_dtype=torch.bfloat16,
    #     # bnb_4bit_use_double_quant=True,
    # )
    tokenizer = AutoTokenizer.from_pretrained(model_id, model_max_length=4096, truncation=True, trust_remote_code=True)
    if tokenizer.pad_token_id is None:
        tokenizer.pad_token = tokenizer.eos_token
        tokenizer.pad_token_id = tokenizer.eos_token_id
    tokenizer.padding_side="left"
    

    model = AutoModelForCausalLM.from_pretrained(
        model_id,
        # quantization_config=bnb_config,
        torch_dtype=torch.bfloat16,
        max_position_embeddings=4096,
        device_map="auto",
        trust_remote_code=True
    )

    return model, tokenizer

def get_pipe(model_id, temp=0.75):
    if 'pipe' in locals():
        del pipe

    model, tokenizer = get_model_and_tokenizer(AVAILABLE_MODELS[model_id])

    print("#"*50)
    print(f"Model Name: {model.config._name_or_path}")
    print(f"Is on CUDA: {next(model.parameters()).is_cuda}")
    print("#"*50)

    if not next(model.parameters()).is_cuda:
        raise Exception(f"Model is not loaded on CUDA.\n{model}")

    return pipeline(
        "text-generation",
        model=model,
        tokenizer=tokenizer,
        pad_token_id=tokenizer.eos_token_id,
        truncation=True,
        max_new_tokens=1024,
        temperature=temp,
        do_sample=True,
        device_map="auto",
        use_cache=True
    )

if __name__ == "__main__":
    model_id = "codestral"      #"mistralai/Codestral-22B-v0.1"
    pipe = get_pipe(model_id)
    print("Pipe created successfully.")