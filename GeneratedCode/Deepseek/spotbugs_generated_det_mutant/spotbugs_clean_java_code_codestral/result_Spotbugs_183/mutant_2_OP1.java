class MutableStaticFieldBug {
    public static String data = "Sensitive Data";
    private static final String unusedVar = "deadStore"; // Dead Store Mutation

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}