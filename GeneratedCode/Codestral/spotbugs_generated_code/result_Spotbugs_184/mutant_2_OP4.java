class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        boolean shouldChange = getCondition(); // This method will return a dynamically determined condition
        if (shouldChange) {
            nonFinalStaticField = newValue;
        } else {
            // Unreachable if-else branch
            String temp = "Unreachable code";
            System.out.println(temp);
        }
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }

    // This method is used to dynamically determine the condition
    private static boolean getCondition() {
        // Add your logic here to return true or false dynamically
        return true; // For demonstration purposes, always return true
    }
}