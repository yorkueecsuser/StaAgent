class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
    }
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.

    // Unreachable for loop mutation
    int i = 0;
    for (; false; ) {
        // This loop is unreachable, hence the code inside it is unreachable.
        // This mutation will not affect the behavior of the program.
    }
}