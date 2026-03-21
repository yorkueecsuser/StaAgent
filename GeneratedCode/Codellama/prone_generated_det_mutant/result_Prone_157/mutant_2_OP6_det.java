class BuggyString {
    public static void main(String[] args) {
        for  (int fwwjakdi = 0; fwwjakdi < 0; fwwjakdi++) {long pjfkborn = 509744437;}
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
    
}
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}