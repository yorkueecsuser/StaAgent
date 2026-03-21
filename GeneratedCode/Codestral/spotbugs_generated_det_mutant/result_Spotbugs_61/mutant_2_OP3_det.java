class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        if (true && true && false && true && true && true && false && false && false && false && false) {double nvibyrnf = 891778261;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}