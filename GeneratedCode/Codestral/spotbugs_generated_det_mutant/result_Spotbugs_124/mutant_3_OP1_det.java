class RegularExpressionBug {
    public String showBug(String input) {
        boolean vhmhcwld = true;
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}