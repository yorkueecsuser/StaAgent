class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Mutant 1: Duplicate the assignment statement for str
        String str = "Hello, World!";

        // Mutant 2: Duplicate the assignment statement for substr
        String substr = str.substring(0);
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}