import argparse
import json
import os
import re
import unicodedata
from urllib.parse import urljoin, urlparse

import requests
from bs4 import BeautifulSoup

DEFAULT_DOC_URL = "https://fbinfer.com/docs/all-issue-types/"
DEFAULT_OUTPUT = "../Rules_List/infer_issue_new.json"

ALLOW_EXACT_TITLES = [
    "ARBITRARY_CODE_EXECUTION_UNDER_LOCK",
    "CHECKERS_ALLOCATES_MEMORY",
    "CHECKERS_ANNOTATION_REACHABILITY_ERROR",
    "CHECKERS_CALLS_EXPENSIVE_METHOD",
    "CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED",
    "CHECKERS_PRINTF_ARGS",
    "DEADLOCK",
    "GUARDEDBY_VIOLATION",
    "INEFFICIENT_KEYSET_ITERATOR",
    "INTERFACE_NOT_THREAD_SAFE",
    "LOCKLESS_VIOLATION",
    "NULLPTR_DEREFERENCE",
    "RESOURCE_LEAK",
    "STARVATION",
    "THREAD_SAFETY_VIOLATION",
    "INTEGER_OVERFLOW_L1",
    "INTEGER_OVERFLOW_L2",
    "INFERBO_ALLOC_MAY_BE_NEGATIVE",
    "INTEGER_OVERFLOW_U5",
    "EXPENSIVE_LOOP_INVARIANT_CALL",
    "INFINITE_EXECUTION_TIME",
    "MUTUAL_RECURSION_CYCLE",
    "MODIFIES_IMMUTABLE",
    "INVARIANT_CALL",
    "PURE_FUNCTION",
    "IMPURE_FUNCTION",
    "BUFFER_OVERRUN_L3",
]


def normalize_text(text):
    return " ".join(text.strip().split())


def normalize_rule_key(text):
    text = unicodedata.normalize("NFKD", text or "")
    text = "".join(ch for ch in text if not unicodedata.category(ch).startswith("C"))
    text = normalize_text(text)
    text = text.split(" - ")[0].split(":")[0].strip()
    return text.replace(" ", "_").replace("-", "_").upper()


def site_base(url):
    parsed = urlparse(url)
    return f"{parsed.scheme}://{parsed.netloc}"


def extract_sections(doc_url):
    response = requests.get(doc_url, timeout=30)
    response.raise_for_status()
    soup = BeautifulSoup(response.text, "html.parser")
    base_url = site_base(doc_url)

    main = soup.find("main")
    if not main:
        raise RuntimeError("Could not find <main> in Infer docs page")

    issues = []
    for h2 in main.find_all("h2"):
        title = normalize_text(h2.get_text())
        if not title:
            continue

        description_parts = []
        links = set()
        sibling = h2.find_next_sibling()
        while sibling is not None and sibling.name != "h2":
            if sibling.name in {"h3", "h4"}:
                sub = normalize_text(sibling.get_text())
                if sub:
                    description_parts.append(sub)
            elif sibling.name in {"p", "pre", "ul", "ol", "blockquote", "div"}:
                text = sibling.get_text(" ", strip=True)
                if text:
                    description_parts.append(text)

            for a in sibling.find_all("a", href=True):
                links.add(urljoin(base_url, a["href"]))
            sibling = sibling.find_next_sibling()

        issues.append(
            {
                "title": title,
                "description": "\n\n".join(description_parts).strip(),
                "links": sorted(links),
            }
        )

    return issues


def extract_flag(page_text):
    text = page_text.lower()

    for pattern in (
        r"activate\s+(?:with|using|by|via)\s+(--[a-z0-9\-]+)",
        r"enabled\s+by\s+(--[a-z0-9\-]+)",
        r"reported\s+(?:as\s+[\"'][^\"']+[\"']\s+)?by\s+([a-z0-9\-]+)",
    ):
        match = re.search(pattern, text)
        if match:
            value = match.group(1).strip()
            return value if value.startswith("--") else f"--{value}"

    return "unknown"


def supports_java(page_soup, page_text):
    text = page_text.lower()
    if re.search(r"java\s*:\s*(yes|experimental|true)", text):
        return True
    if "this error is currently reported in java" in text:
        return True

    for li in page_soup.find_all("li"):
        li_text = normalize_text(li.get_text()).lower()
        if re.search(r"java\s*:\s*(yes|experimental|true)", li_text):
            return True

    return False


def enrich_issue(issue, cache):
    java_supported = False
    flag = "unknown"

    local_soup = BeautifulSoup(issue["description"], "html.parser")
    if supports_java(local_soup, issue["description"]):
        java_supported = True
    local_flag = extract_flag(issue["description"])
    if local_flag != "unknown":
        flag = local_flag

    for link in issue["links"]:
        if "/docs/" not in link:
            continue

        if link in cache:
            link_java, link_flag = cache[link]
        else:
            try:
                r = requests.get(link, timeout=10)
                r.raise_for_status()
                link_soup = BeautifulSoup(r.text, "html.parser")
                link_text = link_soup.get_text(" ", strip=True)
                link_java = supports_java(link_soup, link_text)
                link_flag = extract_flag(link_text)
            except requests.RequestException:
                link_java, link_flag = False, "unknown"
            cache[link] = (link_java, link_flag)

        if link_java:
            java_supported = True
        if flag == "unknown" and link_flag != "unknown":
            flag = link_flag
        if java_supported and flag != "unknown":
            break

    return {
        "title": normalize_rule_key(issue["title"]),
        "description": issue["description"],
        "supported_language": "Java" if java_supported else "other",
        "flag": flag,
    }


def run_pipeline(doc_url, output_file):
    allowed_keys = [normalize_rule_key(t) for t in ALLOW_EXACT_TITLES]
    allowed_key_set = set(allowed_keys)

    try:
        raw_issues = extract_sections(doc_url)
    except requests.RequestException as exc:
        print(f"Could not load rules from base URL: {doc_url}")
        print(f"Request error: {exc}")
        print("Please check the --base-url value or verify the Infer documentation website is reachable.")
        return
    except Exception as exc:
        print(f"Could not parse rules from: {doc_url}")
        print(f"Error: {exc}")
        print("Please check the --base-url value or verify the Infer documentation website structure.")
        return

    cache = {}

    kept = {}
    for raw_issue in raw_issues:
        enriched = enrich_issue(raw_issue, cache)
        key = enriched["title"]

        if enriched["supported_language"] != "Java":
            continue
        if key not in allowed_key_set:
            continue
        if key in kept:
            continue

        kept[key] = enriched

    final_issues = [kept[k] for k in allowed_keys if k in kept]

    output_dir = os.path.dirname(output_file)
    if output_dir:
        os.makedirs(output_dir, exist_ok=True)

    with open(output_file, "w", encoding="utf-8") as f:
        json.dump(final_issues, f, indent=2, ensure_ascii=False)

    print(f"Allow-list size: {len(allowed_key_set)}")
    print(f"Extracted sections: {len(raw_issues)}")
    print(f"Final kept issues: {len(final_issues)}")
    print(f"Wrote output: {output_file}")


def parse_args():
    parser = argparse.ArgumentParser(description="Extract and filter Infer Java issues")
    parser.add_argument(
        "--base-url",
        default=DEFAULT_DOC_URL,
        help=f"Infer issue index URL (default: {DEFAULT_DOC_URL})",
    )
    parser.add_argument(
        "--output",
        default=DEFAULT_OUTPUT,
        help=f"Output JSON path (default: {DEFAULT_OUTPUT})",
    )
    return parser.parse_args()


if __name__ == "__main__":
    args = parse_args()
    run_pipeline(args.base_url, args.output)
