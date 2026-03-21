class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        boolean xopoqbzs = false;while (xopoqbzs && true && true && false && true && false && true && false && true && true && true && false) {int cyuwgeyz = -52247445;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}