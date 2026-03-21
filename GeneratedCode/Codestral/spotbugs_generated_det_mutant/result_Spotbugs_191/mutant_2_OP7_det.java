class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
boolean akietuux = false;while (akietuux && true && true && false && true && false && true && true && true && false && false && false) {double amquqeoc = 209702611;}

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