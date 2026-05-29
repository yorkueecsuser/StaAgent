import requests
from bs4 import BeautifulSoup
import json
import unicodedata

def normalize_text(text):
    """Normalize text to remove special characters and ensure proper encoding."""
    text = unicodedata.normalize("NFKD", text)  # Normalize special characters
    text = text.encode("utf-8", "ignore").decode("utf-8")  # Remove invalid characters
    return text.strip()

def scrape_issues(url, output_file):
    try:
        # Send a GET request to the URL with proper encoding
        response = requests.get(url)
        response.raise_for_status()  # Check for request errors

        # Parse the HTML content
        soup = BeautifulSoup(response.text, 'html.parser')

        # Find all <h2> tags (issue titles) and their corresponding descriptions
        issues = []
        for h2_tag in soup.find_all('h2'):
            issue_title = normalize_text(h2_tag.get_text(strip=True))
            description_tag = h2_tag.find_next_sibling('p')  # Find the next <p> tag after the <h2>
            description = normalize_text(description_tag.get_text(strip=True)) if description_tag else "No description available"

            # Add the issue title and description to the list
            issues.append({
                "title": issue_title,
                "description": description
            })

        # Save the extracted issues to a JSON file
        with open(output_file, 'w', encoding='utf-8') as json_file:
            json.dump(issues, json_file, indent=4, ensure_ascii=False)

        print(f"Scraped issues saved to {output_file}")

    except requests.exceptions.RequestException as e:
        print(f"Could not load rules from URL: {url}")
        print(f"Request error: {e}")
        print("Please check the URL value or verify the Infer documentation website is reachable.")
    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    # URL of the page to scrape
    url = "https://fbinfer.com/docs/all-issue-types/"

    # Output JSON file
    output_file = "../Rules_list/infer_rules.json"

    # Call the scraper function
    scrape_issues(url, output_file)
