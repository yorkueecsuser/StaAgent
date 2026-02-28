class NonFinalStaticFieldBug {
    public static String nonFinalStaticField = "Initial Value";

    public static void changeStaticField(String newValue) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                break;
        }
        nonFinalStaticField = newValue;
    }

    private static int getUnreachableValue() {
        return -1; // Always return a value that's not 1
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}