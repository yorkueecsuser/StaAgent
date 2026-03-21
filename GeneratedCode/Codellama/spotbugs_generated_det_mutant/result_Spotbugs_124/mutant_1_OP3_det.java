class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        if (false && false && true && false && false && false && true && true && true && false && false) {short lzertnbc = 4306;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}