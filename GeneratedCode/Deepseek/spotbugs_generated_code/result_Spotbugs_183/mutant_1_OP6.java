class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable loop
            System.out.println("This line should never be executed.");
        }
        data = newData;
    }
}