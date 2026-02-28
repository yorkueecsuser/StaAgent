class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }

    private static boolean getCondition() {
        return false; // Always return false to make the while loop unreachable
    }
}