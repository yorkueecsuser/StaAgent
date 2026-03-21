class RegularExpressionBug {
    public String showBug(String input) {
        boolean pvtvwfst = false;while (pvtvwfst && true && false && true && true && false && false && true && false && false && false && false) {String auuleloi = "rrpxnhxz";}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}