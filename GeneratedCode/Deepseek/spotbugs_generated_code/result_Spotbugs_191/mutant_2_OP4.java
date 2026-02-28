class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static boolean getFalseCondition() {
        return false;
    }

    public static String performSensitiveOperation() {
        if (getFalseCondition()) {
            // Unreachable if-else statement (Mutant)
            return "This line should never be executed.";
        } else {
            return "Performing sensitive operation with data: " + sensitiveData;
        }
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