class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        if (false && false && true && false && false && false && false && true && true && false && false) {double hdparagy = -294408489;}else{float icrnxagf = -368799658;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}