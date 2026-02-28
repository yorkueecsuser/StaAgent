class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        System.out.println(performSensitiveOperation());

        // Added mutant - unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
            }
        }
    }

    public static int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        showBug();
    }
}