class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    // Mutant code added based on Renaming Operator
    public static String anotherField = "Another Value";

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
        // Added usage of the new field to maintain code coverage
        System.out.println("Current value of another field: " + anotherField);
    }
}