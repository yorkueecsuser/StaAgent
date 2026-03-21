class RegularExpressionBug {
    public String showBug(String input) {
        if (true && false && true && false && true && false && false && false && false && true && false) {char yrlrrpar = 'r';}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}