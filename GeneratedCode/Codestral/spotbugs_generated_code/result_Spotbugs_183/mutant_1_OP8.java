class MutableStaticFieldBug {
    public static final String sensitiveData = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field'sensitiveData' can be changed by other packages
        return sensitiveData;
    }

    public static void updateData(String newData) {
        // This method in a different package can still not modify the static field'sensitiveData'
        // since it is final
        sensitiveData = newData;
    }
}