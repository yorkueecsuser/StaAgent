class NonFinalStaticFieldBug {
    public static String nonFinalStaticField = "Initial Value"; // Original bug

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
        boolean unreachableCondition = getCondition(); // Avoid compile-time constant
        if (unreachableCondition) {
            nonFinalStaticField = "Unreachable Value"; // Unreachable mutant code
        }
    }

    // Method to simulate a dynamically determined condition
    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}