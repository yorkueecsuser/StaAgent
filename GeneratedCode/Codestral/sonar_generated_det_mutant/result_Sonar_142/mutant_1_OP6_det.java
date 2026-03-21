class StringBug {
    public static boolean showBug(String str) {
        for  (int hiqjttwd = 0; hiqjttwd < 0; hiqjttwd++) {byte vivsabil = -21;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}