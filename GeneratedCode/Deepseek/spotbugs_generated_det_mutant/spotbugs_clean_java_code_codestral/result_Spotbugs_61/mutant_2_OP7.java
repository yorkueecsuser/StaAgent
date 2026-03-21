class NullParameterBug {
    public static boolean getFalseCondition() {
        return false; // always returns false to make the loop unreachable
    }

    public static void printLength(String str) {
        while (getFalseCondition()) {
            // This loop is unreachable, added to satisfy the mutation operator requirement
            System.out.println("This line will never be printed.");
        }
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}