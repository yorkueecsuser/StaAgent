// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug

class MutableStaticFieldBug {
    static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        boolean condition = getCondition();
        for (int i = 0;!condition; i++) { // Unreachable for loop
            System.out.println("This line is unreachable.");
        }
        data = newData;
    }

    private static boolean getCondition() {
        return false;
    }
}