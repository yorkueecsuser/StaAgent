class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This will never execute");
                break;
        }

        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 2:
                System.out.println("This will never execute");
                break;
        }

        return String.join(",", resultArray);
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // This ensures that the switch cases never match
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}