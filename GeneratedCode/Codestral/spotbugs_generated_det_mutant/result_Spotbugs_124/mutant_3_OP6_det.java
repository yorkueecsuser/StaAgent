class RegularExpressionBug {
    public String showBug(String input) {
        for  (int xxbnptmn = 0; xxbnptmn < 0; xxbnptmn++) {String lnlucrqn = "terilmtf";}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}