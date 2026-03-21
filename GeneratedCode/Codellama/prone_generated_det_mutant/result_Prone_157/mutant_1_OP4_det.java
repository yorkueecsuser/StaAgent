class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        if (true && true && false && false && true && false && false && true && true && false && false) {String ssoetiez = "mfljyhri";}else{String uxrwfzwh = "xvdkzuxr";}
        System.out.println(substr);
    
}
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}