class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Mutant 1: Unreachable while loop
        while (false) {
            // This loop will never execute
            System.out.println("This code is unreachable");
        }
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.

    // Mutant 2: Unreachable if statement
    if (false) {
        // This code will never execute
        System.out.println("This code is unreachable");
    } else {
        // This code will always execute
        System.out.println("This code is reachable");
    }
}