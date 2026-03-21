class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        if (false && true && true && false && false && true && false && false && false && false && false) {int fjbdsyzj = 14017308;}else{int qznpsqww = 774339747;}
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
}

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}