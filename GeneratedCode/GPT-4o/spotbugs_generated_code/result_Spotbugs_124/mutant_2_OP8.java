class RegexBugExample {

    public String showBug(String input) {
        // This line demonstrates the bug of using "." as a regular expression,
        // which matches any character instead of just the period character.
        String result = input.replace(".", "/"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return result;
    }

    public String showBug2(String input) {
        // This line demonstrates the bug of using "|" as a regular expression,
        // which acts as a logical OR between sub-expressions instead of a literal pipe character.
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return String.join(",", resultArray);
    }

    // Mutation: Renaming user-defined variables
    public String showBug3(String input) {
        // Renamed 'result' to 'x' in this method
        String x = input.replace(".", "/");
        return x;
    }

    public String showBug4(String input) {
        // Renamed 'resultArray' to 'y' in this method
        String[] y = input.split("|");
        return String.join(",", y);
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));

        // Output for mutated methods
        System.out.println("Result of showBug3 with 'a.b.c': " + example.showBug3("a.b.c"));
        System.out.println("Result of showBug4 with 'a|b|c': " + example.showBug4("a|b|c"));
    }
}