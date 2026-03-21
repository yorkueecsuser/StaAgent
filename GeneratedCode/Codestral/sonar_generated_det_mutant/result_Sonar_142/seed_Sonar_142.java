class StringBug {
    public static boolean showBug(String str) {
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    }
}