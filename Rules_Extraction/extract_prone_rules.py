import argparse
import os
import requests
from bs4 import BeautifulSoup
import json

DEFAULT_BASE_URL = "https://errorprone.info/bugpatterns"
DEFAULT_OUTPUT = "../Rules_List/prone_rules.json"
SECTION_ID = "on-by-default--error"


def _extract_rules_from_section(section_header):
    rules = []
    current = section_header.find_next_sibling()

    while current is not None and current.name != "h2":
        if current.name == "p":
            a_tag = current.find("a")
            if a_tag and a_tag.get("href", "").startswith("bugpattern/"):
                title = a_tag.get_text(strip=True)
                full_text = current.get_text(" ", strip=True)
                description = full_text.replace(title, "", 1).strip() or "No description available"
                rules.append({
                    "title": title,
                    "description": description,
                })
        current = current.find_next_sibling()

    return rules


def scrape_error_prone_rules(url, output_file, section_id=SECTION_ID):
    try:
        response = requests.get(url, timeout=30)
        response.raise_for_status()
        soup = BeautifulSoup(response.text, "html.parser")

        section_header = soup.find(id=section_id)
        if section_header is None:
            print(f"Error: section '{section_id}' not found")
            return

        bug_patterns = _extract_rules_from_section(section_header)

        out_dir = os.path.dirname(output_file)
        if out_dir:
            os.makedirs(out_dir, exist_ok=True)

        with open(output_file, "w", encoding="utf-8") as json_file:
            json.dump(bug_patterns, json_file, indent=4, ensure_ascii=False)

        print(f"Scraped {len(bug_patterns)} bug patterns into {output_file}")

    except requests.exceptions.RequestException as e:
        print(f"Could not load rules from base URL: {url}")
        print(f"Request error: {e}")
        print("Please check the --base-url value or verify the Error Prone documentation website is reachable.")
    except Exception as e:
        print(f"An error occurred: {e}")


def parse_args():
    parser = argparse.ArgumentParser(description="Extract Error Prone rules from 'On by default : ERROR'")
    parser.add_argument(
        "--base-url",
        default=DEFAULT_BASE_URL,
        help=f"Error Prone bugpatterns URL (default: {DEFAULT_BASE_URL})",
    )
    parser.add_argument(
        "--output",
        default=DEFAULT_OUTPUT,
        help=f"Output JSON path (default: {DEFAULT_OUTPUT})",
    )
    return parser.parse_args()


if __name__ == "__main__":
    args = parse_args()
    scrape_error_prone_rules(args.base_url, args.output, section_id=SECTION_ID)
