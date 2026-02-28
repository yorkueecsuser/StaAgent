class RegexBugExample {

    public String showBug(String input) {
        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable code in showBug.");
        }

        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return result;
    }

    public String showBug2(String input) {
        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable code in showBug2.");
        }

        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return String.join(",", resultArray);
    }

    // Method to simulate a condition for the unreachable while loop
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}