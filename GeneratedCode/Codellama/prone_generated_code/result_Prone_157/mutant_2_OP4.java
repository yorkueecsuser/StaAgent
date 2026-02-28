class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Unreachable if-else statement
        if (false) {
            // This branch is always false
            System.out.println("This branch is unreachable");
        } else {
            // This branch is always true
            System.out.println("This branch is reachable");
        }
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}