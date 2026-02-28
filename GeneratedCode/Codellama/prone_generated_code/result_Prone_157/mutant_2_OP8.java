class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
    // Mutation: Renaming variable "substr" to "sub"
    public static void main(String[] args) {
        String str = "Hello, World!";
        String sub = str.substring(0);
        System.out.println(sub);
    }
}