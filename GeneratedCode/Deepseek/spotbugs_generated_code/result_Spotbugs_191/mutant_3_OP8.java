class MutableStaticField {
    public static String s = "Confidential Data"; // Renamed sensitiveData to s
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + s; // Updated to use renamed variable
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        s = "Malicious Data"; // Updated to use renamed variable

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}