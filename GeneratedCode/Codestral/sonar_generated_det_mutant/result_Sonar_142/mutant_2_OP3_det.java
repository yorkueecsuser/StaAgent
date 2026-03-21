class StringBug {
    public static boolean showBug(String str) {
        if (true && true && false && false && true && true && false && true && true && false && false) {float punjuzue = -850608425;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}