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
        boolean ewlmlcxk = false;while (ewlmlcxk && false && true && true && false && true && false && false && false && true && true && false) {short undqlfwr = 5929;}
        String[] resultArray = input.split("|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return String.join(",", resultArray);
    
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("Result of showBug with 'a.b.c': " + example.showBug("a.b.c"));
        System.out.println("Result of showBug2 with 'a|b|c': " + example.showBug2("a|b|c"));
    }
}