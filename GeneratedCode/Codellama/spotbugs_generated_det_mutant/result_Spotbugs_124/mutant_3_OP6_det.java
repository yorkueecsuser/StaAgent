class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        for  (int nxfcemdv = 0; nxfcemdv < 0; nxfcemdv++) {short deipzqpi = 9999;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}