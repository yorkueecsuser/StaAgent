class RegularExpressionBug {
    public String showBug(String input) {
        String mrfajyvo = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return mrfajyvo;
    }
}