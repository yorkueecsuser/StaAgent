class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutation: Adding an unreachable if statement
        boolean condition = getFalseCondition(); // Using a method call to avoid compile-time constant
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutation: Adding an unreachable if statement
        boolean condition = getFalseCondition(); // Using a method call to avoid compile-time constant
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return String.join(",", resultArray);
    }

    // Method to simulate a condition that returns false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}