class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        return String.join(",", resultArray);
    }
    
    // Method to ensure runtime condition evaluation
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}