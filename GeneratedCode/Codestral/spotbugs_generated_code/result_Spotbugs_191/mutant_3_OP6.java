class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Added mutant code: Unreachable for loop
        boolean shouldModifyData = getCondition();
        for (int i = 0; shouldModifyData; i++) {
            sensitiveData = "Malicious Data";
        }

        System.out.println(performSensitiveOperation());
    }

    public static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        showBug();
    }
}