class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
if (false && true && true && true && false && false && false && false && true && false && false) {short qdetpwhl = 8045;}else{boolean cmudtnvv = true;}

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