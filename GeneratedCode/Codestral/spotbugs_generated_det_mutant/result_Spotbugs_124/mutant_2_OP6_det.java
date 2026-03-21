class RegularExpressionBug {
    public String showBug(String input) {
        for  (int rnnxwviw = 0; rnnxwviw < 0; rnnxwviw++) {boolean sxnuhhoc = true;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}