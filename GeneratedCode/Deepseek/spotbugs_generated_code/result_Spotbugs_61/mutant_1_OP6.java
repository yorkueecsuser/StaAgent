class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter

        // Unreachable for loop mutant
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}