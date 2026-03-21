class RegularExpressionBug {
    public String showBug(String input) {
        if (false && true && true && true && false && false && false && true && false && true && false) {char bgasezwn = 'c';}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}