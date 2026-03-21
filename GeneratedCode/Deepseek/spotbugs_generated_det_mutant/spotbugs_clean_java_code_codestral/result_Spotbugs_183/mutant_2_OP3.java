// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug

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

    // Added mutant code with unreachable if statement
    public static void unreachableIfStatementMutant() {
        boolean condition = false; // Always false for the mutant
        if (condition) {
            data = "Mutated Sensitive Data"; // This line should be unreachable
        }
    }
}