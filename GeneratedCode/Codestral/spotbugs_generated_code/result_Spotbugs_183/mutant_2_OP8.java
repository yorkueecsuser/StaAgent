class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }

    // Mutant: Renamed the variable 'newData' to 'newSensitiveData'
    public static void modifyDataRenamed(String newSensitiveData) {
        // This method in a different package can modify the static field 'data'
        data = newSensitiveData;
    }
}