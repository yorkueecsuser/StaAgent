class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        boolean condition = getCondition(); // Non-final variable to ensure condition is evaluated at runtime
        if (condition) {
            // This block is unreachable because the condition is always false at runtime
            System.out.println("This is an unreachable block in showBug.");
        } else {
            System.out.println("This is the else block in showBug.");
        }

        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        boolean condition = getCondition(); // Non-final variable to ensure condition is evaluated at runtime
        if (condition) {
            // This block is unreachable because the condition is always false at runtime
            System.out.println("This is an unreachable block in showBug2.");
        } else {
            System.out.println("This is the else block in showBug2.");
        }

        return String.join(",", resultArray);
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }

    private boolean getCondition() {
        return false; // Ensures the condition is always false at runtime
    }
}