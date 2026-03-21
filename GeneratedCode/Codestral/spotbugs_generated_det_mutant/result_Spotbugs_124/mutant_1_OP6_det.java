class RegularExpressionBug {
    public String showBug(String input) {
        for  (int pbntcrpq = 0; pbntcrpq < 0; pbntcrpq++) {double eotuzshv = 647497236;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}