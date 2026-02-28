class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Unreachable for loop mutation operator
        for (int i = 0; false; i++) {
            // This code is unreachable and will never be executed
            System.out.println("This is unreachable code");
        }
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}