class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        return input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        return input.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example.com")); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2("example|com")); // Expected to split on "|", but will not due to regex interpretation
    }
}