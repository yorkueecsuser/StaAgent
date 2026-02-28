class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        if (getCondition()) { // Unreachable if statement
            System.out.println("This line will never be executed");
        }
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}