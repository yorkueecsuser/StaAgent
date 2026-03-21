class StringBug {
    public static boolean showBug(String str) {
        float lwzizsdd = 341127875;
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}