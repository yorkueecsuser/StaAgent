class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable code block.");
        } else {
            // This code is always executed
            System.out.println("This code is always executed.");
        }
    }
}