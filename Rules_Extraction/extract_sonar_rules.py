import argparse
import json
import os
import re
from urllib.parse import urljoin

import requests
from bs4 import BeautifulSoup

DEFAULT_BASE_URL = "https://rules.sonarsource.com/java/type/bug/"
DEFAULT_OUTPUT = "../Rules_List/sonar_rules.json"
DESCRIPTION_CLASS_PREFIX = "RuleDescriptionstyles__StyledTab-sc-4203wg-4"


def fetch(url):
    response = requests.get(url, timeout=30)
    response.raise_for_status()
    return response.text


def extract_rule_links(base_url):
    soup = BeautifulSoup(fetch(base_url), "html.parser")
    rules = []
    seen = set()

    for a_tag in soup.find_all("a", href=True):
        href = a_tag["href"].strip()
        low = href.lower()
        if not (low.startswith("/java/type/bug/") and len(low) > len("/java/type/bug/")):
            continue
        if href in seen:
            continue

        h3_tag = a_tag.find("h3") or a_tag.find_next("h3")
        title = h3_tag.get_text(strip=True) if h3_tag else ""
        seen.add(href)
        rules.append({"href": href, "title": title})

    return rules


def extract_description(html):
    soup = BeautifulSoup(html, "html.parser")

    desc_div = None
    for div in soup.find_all("div"):
        classes = div.get("class") or []
        class_name = " ".join(classes)
        if class_name.startswith(DESCRIPTION_CLASS_PREFIX):
            desc_div = div
            break

    if desc_div is None:
        return "N/A"

    parts = []
    for el in desc_div.find_all(["p", "pre", "h2", "h3", "ul", "li"]):
        txt = el.get_text(" ", strip=True)
        if txt:
            parts.append(txt)

    return "\n".join(parts) if parts else "N/A"


def scrape_sonar_rules(base_url, output_file):
    try:
        rules = extract_rule_links(base_url)
    except requests.RequestException as exc:
        print(f"Could not load rules from base URL: {base_url}")
        print(f"Request error: {exc}")
        print("Please check the --base-url value or verify the Sonar documentation website is reachable.")
        return

    if not rules:
        print(f"No rules were found at: {base_url}")
        print("Please check the --base-url value or verify the Sonar documentation website structure.")
        return

    output = []

    for rule in rules:
        href = rule["href"].strip("/")
        full_url = urljoin(base_url, href)
        title = rule["title"]

        print(f"Fetching: {full_url}")
        try:
            html = fetch(full_url)
            description = extract_description(html)
        except requests.RequestException as exc:
            print(f"Failed to fetch {full_url}: {exc}")
            description = "N/A"

        output.append({
            "href": href,
            "title": title,
            "description": description,
        })

    out_dir = os.path.dirname(output_file)
    if out_dir:
        os.makedirs(out_dir, exist_ok=True)
    with open(output_file, "w", encoding="utf-8") as f:
        json.dump(output, f, indent=4, ensure_ascii=False)

    print(f"Saved {len(output)} rules to {output_file}")


def parse_args():
    parser = argparse.ArgumentParser(description="Extract Sonar Java bug rules")
    parser.add_argument(
        "--base-url",
        default=DEFAULT_BASE_URL,
        help=f"Sonar rules list URL (default: {DEFAULT_BASE_URL})",
    )
    parser.add_argument(
        "--output",
        default=DEFAULT_OUTPUT,
        help=f"Output JSON path (default: {DEFAULT_OUTPUT})",
    )
    return parser.parse_args()


if __name__ == "__main__":
    args = parse_args()
    scrape_sonar_rules(args.base_url, args.output)
