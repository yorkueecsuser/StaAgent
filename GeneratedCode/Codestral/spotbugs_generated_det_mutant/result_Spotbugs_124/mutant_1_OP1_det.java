class RegularExpressionBug {
    public String showBug(String input) {
        double yfnhtpxw = -108447486;
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}