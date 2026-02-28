class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    private static boolean getCondition() {
        return false;
    }

    public static String performSensitiveOperation() {
        if (getCondition()) {
            // Unreachable code
            sensitiveData = "Unreachable Data";
        } else {
            // Original code
            return "Performing sensitive operation with data: " + sensitiveData;
        }
        return sensitiveData;
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