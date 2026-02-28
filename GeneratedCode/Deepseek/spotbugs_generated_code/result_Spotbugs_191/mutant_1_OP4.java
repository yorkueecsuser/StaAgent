class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        // Mutant code: Unreachable if-else statement
        if (getFalseCondition()) {
            sensitiveData = "Unreachable Data";
        } else {
            // This branch is unreachable
            System.out.println("This line should never be executed");
        }

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}