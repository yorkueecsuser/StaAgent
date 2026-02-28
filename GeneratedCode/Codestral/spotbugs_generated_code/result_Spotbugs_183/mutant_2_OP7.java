class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        return data;
    }

    public static void modifyData(String newData) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code is unreachable
        }
        data = newData;
    }

    private static boolean getUnreachableCondition() {
        return false;
    }
}