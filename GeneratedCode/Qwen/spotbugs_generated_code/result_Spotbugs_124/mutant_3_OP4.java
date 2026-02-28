class RegexExample {

    public String showBug(String input) {
        // This line contains the bug as it uses "." in a regular expression context without escaping it
        return input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never print");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This should also never print");
        }
    }

    public String showBug2(String input) {
        // This line contains the bug as it uses "|" in a regular expression context without escaping it
        return input.split("|")[0]; // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never print");
        } else {
            // This block is also intended to be unreachable
            System.out.println("This should also never print");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example.com")); // Expected to replace "." with "/", but will not due to regex interpretation
        System.out.println(example.showBug2("example|com")); // Expected to split on "|", but will not due to regex interpretation
    }
}