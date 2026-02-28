class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        // Inserted mutant - Unreachable if statement
        if (getCondition()) {
            System.out.println("This code should never execute");
        }

        System.out.println(performSensitiveOperation());
    }

    // Dummy method to provide a condition for the unreachable if statement
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}