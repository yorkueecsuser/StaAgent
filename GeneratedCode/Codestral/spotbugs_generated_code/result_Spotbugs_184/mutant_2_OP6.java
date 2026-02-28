class NonFinalStaticFieldBug {
    public static String nonFinalStaticField = "Initial Value";

    public static void changeStaticField(String newValue) {
        for (int i = 0; getCondition(); i++) { // Unreachable for loop mutation
            // This loop will never execute as the condition is always false
            // But it's added to simulate the mutation operator
        }
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }
}