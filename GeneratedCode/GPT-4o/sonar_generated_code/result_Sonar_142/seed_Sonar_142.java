class StringOperationsDemo {

    // Method demonstrating predictable string operations
    public void showBug() {
        String str = "example";

        // Check if the string contains itself
        boolean containsItself = str.contains(str); // BUG: String operations with predictable outcomes should be avoided

        // Compare the string with itself
        boolean compareItself = str.equals(str); // BUG: String operations with predictable outcomes should be avoided

        // Match the string against itself
        boolean matchesItself = str.matches(str); // BUG: String operations with predictable outcomes should be avoided

        // Create a substring from 0 to the end of the string
        String substringFromStart = str.substring(0, str.length()); // BUG: String operations with predictable outcomes should be avoided

        // Create a substring from the end of the string
        String substringFromEnd = str.substring(str.length()); // BUG: String operations with predictable outcomes should be avoided

        // Replace a string with itself
        String replaceItself = str.replace(str, str); // BUG: String operations with predictable outcomes should be avoided

        // Replace a substring with the exact substring
        String replaceSubstringItself = str.replace("ex", "ex"); // BUG: String operations with predictable outcomes should be avoided

        System.out.println("Contains itself: " + containsItself);
        System.out.println("Compare itself: " + compareItself);
        System.out.println("Matches itself: " + matchesItself);
        System.out.println("Substring from start: " + substringFromStart);
        System.out.println("Substring from end: " + substringFromEnd);
        System.out.println("Replace itself: " + replaceItself);
        System.out.println("Replace substring with itself: " + replaceSubstringItself);
    }

    public static void main(String[] args) {
        StringOperationsDemo demo = new StringOperationsDemo();
        demo.showBug();
    }
}