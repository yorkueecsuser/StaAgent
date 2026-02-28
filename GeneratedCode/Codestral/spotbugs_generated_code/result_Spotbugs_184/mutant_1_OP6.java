class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;

        // Mutation: Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code should not be executed");
        }
    }

    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}