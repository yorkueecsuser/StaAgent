class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    // Mutated Code: Dead Store Mutation Operator
    private static String deadStoreVariable = "Unused Value";

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
        deadStoreVariable = "Updated Value"; // This line updates the dead store variable, although it isn't used
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}