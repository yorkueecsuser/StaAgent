class RegularExpressionBug {
    public String showBug(String input) {
        String str = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return str;
    }

    // Mutated code
    public String mutantFunction(String str) {
        String r = str.replace("|", ".");
        return r;
    }
}