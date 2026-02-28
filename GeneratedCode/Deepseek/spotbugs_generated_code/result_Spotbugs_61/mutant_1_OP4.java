class NullParameterBug {
    public static void printLength(String str) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
        } else {
            // Unreachable if-else branch
            System.out.println("This branch is unreachable.");
        }
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