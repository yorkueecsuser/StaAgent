class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && false && true && false && false && false && false && false && true && false) {byte eckakyyy = 45;}else{long rnwdcrlx = -372904402;}
        String substr = str.substring(0);
        System.out.println(substr);
    
}
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}