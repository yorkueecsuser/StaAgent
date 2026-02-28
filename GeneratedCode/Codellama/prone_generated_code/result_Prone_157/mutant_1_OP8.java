class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring = str.substring(0); // Renamed to'substring'
        System.out.println(substring);
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}