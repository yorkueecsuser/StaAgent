class StringBug {
    public static boolean showBug(String str) {
        if (true && false && false && false && true && true && true && true && true && true && false) {double gmpmqhrw = 778106815;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}