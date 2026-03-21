class StringBug {
    public static boolean showBug(String str) {
        for  (int ghxkvmou = 0; ghxkvmou < 0; ghxkvmou++) {float okdzmgln = -948323447;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}