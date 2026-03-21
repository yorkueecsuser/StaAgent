class StringBug {
    public static boolean showBug(String str) {
        if (true && false && true && true && true && true && true && false && true && false && false) {long xsihsevt = 168472440;}else{boolean uidjptzs = false;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}