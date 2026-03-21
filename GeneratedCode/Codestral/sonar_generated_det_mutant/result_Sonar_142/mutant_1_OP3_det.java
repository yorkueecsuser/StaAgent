class StringBug {
    public static boolean showBug(String str) {
        if (true && false && true && false && false && false && true && true && true && false && false) {short tvobmiuj = -1419;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}