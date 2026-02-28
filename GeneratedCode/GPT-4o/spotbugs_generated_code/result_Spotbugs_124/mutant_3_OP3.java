class RegexBugExample {

    public String showBug(String input) {
        boolean condition = getCondition(); // Unreachable if statement condition
        if (condition) {
            // This block is unreachable due to the condition being false
            System.out.println("This will never be printed.");
        }
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return result;
    }

    public String showBug2(String input) {
        boolean condition = getCondition(); // Unreachable if statement condition
        if (condition) {
            // This block is unreachable due to the condition being false
            System.out.println("This will never be printed.");
        }
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return String.join(",", resultArray);
    }

    public boolean getCondition() {
        return false; // This method returns false, making the above conditions unreachable
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}