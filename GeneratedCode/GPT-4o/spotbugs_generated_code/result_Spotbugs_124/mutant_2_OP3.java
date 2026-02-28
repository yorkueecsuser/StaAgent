class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        // Unreachable if statement added as per mutation operator
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        // Unreachable if statement added as per mutation operator
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        return String.join(",", resultArray);
    }
    
    // A method to always return false, making the if statements unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}