class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        for  (int yqopztby = 0; yqopztby < 0; yqopztby++) {char ebmkzxih = 'n';}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}