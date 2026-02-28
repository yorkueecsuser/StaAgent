class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
        // Mutant: Unreachable switch statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            switch (nonFinalStaticField) {
                case "Impossible Value":
                    System.out.println("This line should never be executed");
                    break;
            }
        }
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}