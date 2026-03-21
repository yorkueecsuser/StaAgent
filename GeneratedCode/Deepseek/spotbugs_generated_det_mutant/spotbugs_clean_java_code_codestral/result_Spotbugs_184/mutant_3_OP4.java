class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as the condition is always false
            nonFinalStaticField = "Unreachable Value";
        } else {
            nonFinalStaticField = newValue;
        }
    }

    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}