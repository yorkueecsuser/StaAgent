class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        if (false && false && false && false && true && true && true && false && false && false && false) {char fnexuygn = 'y';}else{boolean blofhdvw = false;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}