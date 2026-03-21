class StringBug {
    public static boolean showBug(String str) {
        for  (int xnqorouh = 0; xnqorouh < 0; xnqorouh++) {short fqxqfcwp = 9739;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}