class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }

    // Mutant code added based on the Mutation Operator description
    public static void changeStaticFieldWithDoWhileLoop(String[] values) {
        int i = 0;
        do {
            nonFinalStaticField = values[i];
            i++;
        } while (i < values.length);
    }
}