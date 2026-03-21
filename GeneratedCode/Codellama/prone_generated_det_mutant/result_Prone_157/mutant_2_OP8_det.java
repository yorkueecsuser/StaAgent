class BuggyString {
    public static void main(String[] args) {
        String ogcopjcr = "Hello, World!";
        String subogcopjcr = ogcopjcr.subogcopjcring(0);
        System.out.println(subogcopjcr);
    }
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}