class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        if (false && false && true && false && false && true && false && true && false && false && false) {boolean zzvdjbom = true;}else{long ugbqqblw = -429141509;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}