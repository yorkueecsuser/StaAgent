class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
        int value = 0;
        // Mutant: Unreachable switch statement
        switch (value) {
            case 1:
                throw new RuntimeException("This is an unreachable case in the switch statement");
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