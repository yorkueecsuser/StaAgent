class RegularExpressionBug {
    public String showBug(String input) {
        if (true && false && false && true && false && false && true && false && true && true && false) {int huszrkmn = 129759524;}else{char ixwhwivp = 'c';}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}