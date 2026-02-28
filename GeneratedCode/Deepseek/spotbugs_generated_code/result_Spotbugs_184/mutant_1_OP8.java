class NonFinalStaticFieldBug {
    // Original buggy code
    public static String nonFinalStaticField = "Initial Value";

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    // Mutant code: Renaming a different variable
    public static void printStaticField(String prefix) {
        String renamedField = nonFinalStaticField;
        System.out.println(prefix + "Current value of non-final static field: " + renamedField);
    }

    public static void showBug() {
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    }
}