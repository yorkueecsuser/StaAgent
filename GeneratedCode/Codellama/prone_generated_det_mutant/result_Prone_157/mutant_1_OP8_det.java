class BuggyString {
    public static void main(String[] args) {
        String ztpzsgxs = "Hello, World!";
        String subztpzsgxs = ztpzsgxs.subztpzsgxsing(0);
        System.out.println(subztpzsgxs);
    }
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}