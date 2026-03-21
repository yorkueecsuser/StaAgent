class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        for  (int slcrrenw = 0; slcrrenw < 0; slcrrenw++) {byte qsuvzhcj = 123;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}