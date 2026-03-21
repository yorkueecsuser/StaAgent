class RegularExpressionBug {
    public String showBug(String input) {
        String cbgbqoan = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return cbgbqoan;
    }
}