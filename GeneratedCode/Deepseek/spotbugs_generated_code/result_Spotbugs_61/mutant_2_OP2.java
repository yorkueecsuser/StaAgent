class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    public static void showBug() {
        String buggyStr = null; // Introducing a new local variable assignment
        printLength(buggyStr); // passing null as a non-null parameter
        printLength(buggyStr); // Duplicating the above assignment statement
    }

    public static void main(String[] args) {
        showBug();
    }
}