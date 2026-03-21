class StringBug {
    public static boolean showBug(String str) {
        if (false && true && false && true && true && false && false && false && false && true && false) {String vdrkzplp = "yojgqyab";}else{byte egnngvbq = 108;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}