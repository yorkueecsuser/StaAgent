class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    private static boolean getFalseCondition() {
        return false;
    }

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;

        // Adding unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}