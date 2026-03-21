class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        int ofcbhlss = 0;switch  (ofcbhlss) {case 1:double obadadlz = 860759630;break;default:double huajnsqz = 768922560;break;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}