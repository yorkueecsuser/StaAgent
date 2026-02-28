class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        return data;
    }

    public static void modifyData(String newData) {
        boolean condition = false;
        // Insert unreachable if-else statement
        if (condition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        } else {
            // The static field 'data' can be changed by other packages
            data = newData;
        }
    }
}