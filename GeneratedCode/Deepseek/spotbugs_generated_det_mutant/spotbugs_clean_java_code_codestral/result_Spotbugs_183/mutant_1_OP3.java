class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        return data;
    }

    public static void modifyData(String newData) {
        boolean shouldModify = false;  // This condition is always false
        if (shouldModify) {
            data = newData;  // This line will be unreachable
        }
    }
}