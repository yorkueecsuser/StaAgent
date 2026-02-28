class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        //Unreachable if statement mutation operator
        if(false) {
            System.out.println("This code is unreachable");
        }
        for (String part : split) {
            System.out.println(part);
        }
    }
}