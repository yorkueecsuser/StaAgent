class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            return input.replace("x", "y");
        }
        return input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            return input.split("x")[0];
        }
        return input.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example.com")); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2("example|com")); // Expected to split on "|", but will not due to regex interpretation
    }
}