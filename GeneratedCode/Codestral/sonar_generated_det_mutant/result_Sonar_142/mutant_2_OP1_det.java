class StringBug {
    public static boolean showBug(String str) {
        long mjbpucwh = -915808224;
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}