class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        String a = input; // Renamed variable
        return a.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        String b = input; // Renamed variable
        return b.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        String c = "example.com"; // Renamed variable
        String d = "example|com"; // Renamed variable
        System.out.println(example.showBug(c)); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2(d)); // Expected to split on "|", but will not due to regex interpretation
    }
}