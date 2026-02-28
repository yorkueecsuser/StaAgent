class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code - this loop will never execute because unreachableCondition is always false
            System.out.println("This is an unreachable loop.");
        }
        data = newData;
    }
}