class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        // Inserting unreachable if branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        }

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}