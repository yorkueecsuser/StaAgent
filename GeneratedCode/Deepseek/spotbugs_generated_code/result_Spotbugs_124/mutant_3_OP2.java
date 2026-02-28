class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        String duplicateOutput = input.replace(".", "|"); // Mutant: Duplicated assignment statement
        return output;
    }
}