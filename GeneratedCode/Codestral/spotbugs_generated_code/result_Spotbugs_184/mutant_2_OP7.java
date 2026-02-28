class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;

        // Unreachable while loop mutant
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable loop.");
        }
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}