class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        if (true && false && false && true && true && false && true && true && false && true && false) {short wxvetnzp = 3662;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}