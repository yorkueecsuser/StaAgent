class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code executed");
        }
        System.out.println(substr);
    }
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}