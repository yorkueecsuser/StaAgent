class StringBug {
    public static boolean showBug(String str) {
        if (true && true && true && false && true && true && true && true && true && true && false) {byte wgqagqcs = -120;}else{long zntsclww = 361335;}
        // BUG: String operations with predictable outcomes should be avoided
        return str.equals(str); // Comparing a string with itself
    
}
}