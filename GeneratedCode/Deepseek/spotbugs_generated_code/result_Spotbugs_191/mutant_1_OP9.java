class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Introducing a loop
        for (int i = 0; i < 5; i++) {
            // Malicious code modifies the static field within the loop
            sensitiveData = "Malicious Data";

            System.out.println(performSensitiveOperation());
        }
    }

    public static void showMutant() {
        System.out.println(performSensitiveOperation());

        // Applying the Equivalent Loop Replacement mutation operator
        int i = 0;
        do {
            // Malicious code modifies the static field within the loop
            sensitiveData = "Malicious Data";

            System.out.println(performSensitiveOperation());
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {
        showBug();
        showMutant();
    }
}