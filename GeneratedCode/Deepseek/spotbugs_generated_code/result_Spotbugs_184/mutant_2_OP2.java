class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    public static String duplicatedNonFinalStaticField = nonFinalStaticField; // Mutant addition

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
        duplicatedNonFinalStaticField = newValue; // Mutant addition
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
        System.out.println("Current value of duplicated non-final static field: " + duplicatedNonFinalStaticField); // Mutant addition
    }
}