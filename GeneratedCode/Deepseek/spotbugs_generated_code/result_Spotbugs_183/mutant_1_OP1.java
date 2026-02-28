// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug with a dead store mutation

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        String deadStore = "unusedVar";  // Dead store mutation
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}