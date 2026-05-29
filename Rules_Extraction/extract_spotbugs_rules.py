import argparse
import os
import requests
from bs4 import BeautifulSoup
import json

DEFAULT_BASE_URL = "https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html"
DEFAULT_OUTPUT = "../Rules_List/spotbugs_rules.json"
CATEGORY_SECTION_IDS = {
    "performance": "performance-performance",
    "correctness": "correctness-correctness",
    "security": "security-security",
}


def _extract_rules_from_section(section):
    rules = []

    for h3_tag in section.find_all("h3"):
        rule_title = h3_tag.get_text(strip=True)
        description_tag = h3_tag.find_next("p")
        description = description_tag.get_text(strip=True) if description_tag else "No description available"
        rules.append({
            "rule": rule_title,
            "description": description,
        })

    return rules


def scrape_spotbugs_rules(url, output_file, categories=None):
    selected_categories = categories or list(CATEGORY_SECTION_IDS.keys())
    selected_categories = [category.lower().strip() for category in selected_categories]

    invalid_categories = sorted(set(selected_categories) - set(CATEGORY_SECTION_IDS.keys()))
    if invalid_categories:
        raise ValueError(
            f"Unsupported categories: {', '.join(invalid_categories)}. "
            f"Allowed categories: {', '.join(CATEGORY_SECTION_IDS.keys())}"
        )

    try:
        response = requests.get(url, timeout=30)
        response.raise_for_status()
        soup = BeautifulSoup(response.text, "html.parser")

        bug_rules = []
        for category in selected_categories:
            section_id = CATEGORY_SECTION_IDS[category]
            section_root = soup.find(id=section_id)
            if section_root is None:
                print(f"Warning: could not find section '{category}' ({section_id})")
                continue

            section = section_root if section_root.name == "section" else section_root.find_parent("section")
            if section is None:
                print(f"Warning: could not resolve section container for '{category}' ({section_id})")
                continue

            bug_rules.extend(_extract_rules_from_section(section))

        out_dir = os.path.dirname(output_file)
        if out_dir:
            os.makedirs(out_dir, exist_ok=True)

        with open(output_file, "w", encoding="utf-8") as json_file:
            json.dump(bug_rules, json_file, indent=4, ensure_ascii=False)

        print(f"Scraped {len(bug_rules)} bug rules into {output_file}")

    except requests.exceptions.RequestException as e:
        print(f"Could not load rules from base URL: {url}")
        print(f"Request error: {e}")
        print("Please check the --base-url value or verify the SpotBugs documentation website is reachable.")
    except Exception as e:
        print(f"An error occurred: {e}")


def parse_args():
    parser = argparse.ArgumentParser(description="Extract SpotBugs rules by category")
    parser.add_argument(
        "--base-url",
        default=DEFAULT_BASE_URL,
        help=f"SpotBugs bug descriptions URL (default: {DEFAULT_BASE_URL})",
    )
    parser.add_argument(
        "--output",
        default=DEFAULT_OUTPUT,
        help=f"Output JSON path (default: {DEFAULT_OUTPUT})",
    )
    return parser.parse_args()


if __name__ == "__main__":
    args = parse_args()
    scrape_spotbugs_rules(args.base_url, args.output, categories=["performance", "correctness", "security"])
