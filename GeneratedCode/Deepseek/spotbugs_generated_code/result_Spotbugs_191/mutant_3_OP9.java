class MutableStaticField {
    public static String sensitiveData = "Confidential Data";

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code attempts to modify the static field using a do-while loop
        int counter = 0;
        do {
            // This do-while loop intentionally does not modify the sensitiveData field
            counter++;
        } while (counter < 1);

        System.out.println(performSensitiveOperation());
    }

    public static void main(String[] args) {
        showBug();
    }
}