class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        if (false && false && true && false && true && true && true && false && true && false && false) {byte fzvflmai = 65;}else{float hxihcano = -348350843;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}