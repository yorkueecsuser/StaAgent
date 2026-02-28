class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        boolean shouldNotRun = false; // The condition to make the if-else branch unreachable
        if (shouldNotRun) {
            // This block of code is unreachable
            System.out.println("This line should never be executed");
        } else {
            // This block of code is the original code
            // No changes are made in this block
        }

        return output;
    }
}