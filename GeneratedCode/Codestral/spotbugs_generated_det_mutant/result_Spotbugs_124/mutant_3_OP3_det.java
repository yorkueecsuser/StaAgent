class RegularExpressionBug {
    public String showBug(String input) {
        if (false && true && true && false && false && true && false && false && false && false && false) {boolean grjfyvhy = true;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}