class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }

        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}