class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static boolean getCondition() {
        return false;
    }

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        boolean shouldModify = getCondition();
        if (shouldModify) {
            sensitiveData = "Malicious Data";
        }

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}