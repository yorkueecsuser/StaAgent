#!/usr/bin/env python3
"""
Harvest PMD Java rules and dump them to java_rules.json
"""
import argparse
import json
import os
import re
import requests
import xml.etree.ElementTree as ET

DEFAULT_BASE_URL = (
    "https://raw.githubusercontent.com/pmd/pmd/refs/heads/main/"
    "pmd-java/src/main/resources/"
)
DEFAULT_OUTPUT = "../Rules_List/pmd_rules.json"

# files to skip (relative to category/java/)
SKIP = {
    "category/java/bestpractices.xml",
    "category/java/codestyle.xml",
    "category/java/design.xml",
    "category/java/documentation.xml",
}
# SKIP = {}

NAMESPACE = {"p": "http://pmd.sourceforge.net/ruleset/2.0.0"}

RULE_IDX = 0

# -----------------------------------------------------------------------------
def download(url: str) -> str:
    print(f"Downloading {url} ...",)
    r = requests.get(url, timeout=30)
    r.raise_for_status()
    return r.text

def rules_from_xml(xml_text: str, rule_type: str):
    global RULE_IDX

    root = ET.fromstring(xml_text)
    # find all <rule> elements in the default namespace
    for rule in root.findall(".//p:rule", NAMESPACE):
        title = rule.get("name", "").strip()

        # description may contain mixed text, so join all inner text
        desc_el = rule.find("p:description", NAMESPACE)
        description = ""
        if desc_el is not None:
            description = "".join(desc_el.itertext()).strip()

        # examples inside CDATA
        examples = []
        for ex_el in rule.findall("p:example", NAMESPACE):
            if ex_el is not None:
                example_text = "".join(ex_el.itertext()).strip()
                if example_text:
                    examples.append(example_text)
        example = "\n---\n".join(examples)

        # message attribute
        error_msg = rule.get("message", "").strip()

        # externalInfoUrl attribute (or child)
        url = rule.get("externalInfoUrl", "").strip()
        if not url:
            url_el = rule.find("p:externalInfoUrl", NAMESPACE)
            if url_el is not None:
                url = "".join(url_el.itertext()).strip()
        # rewrite the baseurl placeholder
        url = re.sub(
            r"\$\{pmd\.website\.baseurl\}",
            "https://docs.pmd-code.org/pmd-doc-7.14.0",
            url,
        )

        RULE_IDX += 1
        yield {
            "index": RULE_IDX,
            "title": title,
            "description_only": description,
            "rule_type": rule_type,
            "example": example,
            "description": f"{description}\nExamples:\n{example}" if example else description,
            "errorMessage": error_msg,
            "url": url,
        }

# -----------------------------------------------------------------------------
def parse_args():
    parser = argparse.ArgumentParser(description="Extract PMD Java rules")
    parser.add_argument(
        "--base-url",
        default=DEFAULT_BASE_URL,
        help=f"PMD rules base URL (default: {DEFAULT_BASE_URL})",
    )
    parser.add_argument(
        "--output",
        default=DEFAULT_OUTPUT,
        help=f"Output JSON path (default: {DEFAULT_OUTPUT})",
    )
    return parser.parse_args()


def main():
    args = parse_args()
    base_url = args.base_url if args.base_url.endswith("/") else f"{args.base_url}/"
    categories_prop = base_url + "category/java/categories.properties"

    try:
        props = download(categories_prop)
    except requests.RequestException as exc:
        print(f"Could not load rules from base URL: {base_url}")
        print(f"Request error: {exc}")
        print("Please check the --base-url value or verify the PMD documentation website is reachable.")
        return

    xml_paths = []
    for line in props.splitlines():
        line = line.strip()
        if not line or not line.startswith("category/java/"):
            continue
        path = line.split(",")[0].strip()
        if path not in SKIP:
            xml_paths.append(path)

    all_rules = []
    for path in xml_paths:
        try:
            xml_raw = download(base_url + path)
        except requests.RequestException as exc:
            print(f"Failed to fetch rule file: {base_url + path}")
            print(f"Request error: {exc}")
            print("Please check the --base-url value or verify the PMD documentation website is reachable.")
            continue
        rule_type = path.split("/")[2].replace(".xml", "")
        all_rules.extend(rules_from_xml(xml_raw, rule_type))

    out_dir = os.path.dirname(args.output)
    if out_dir:
        os.makedirs(out_dir, exist_ok=True)

    with open(args.output, "w", encoding="utf-8") as fh:
        json.dump(all_rules, fh, ensure_ascii=False, indent=4)

    print(f"Collected {len(all_rules)} rules into {args.output}")

if __name__ == "__main__":
    main()
