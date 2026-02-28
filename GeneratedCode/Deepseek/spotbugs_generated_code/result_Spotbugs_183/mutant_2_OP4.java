// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug
// with an unreachable if-else statement mutation

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        boolean unreachableCondition = false; // This condition always evaluates to false, making the branch unreachable
        if (unreachableCondition) {
            // Unreachable mutation: This part of the code will never be executed
            return "Mutated Data";
        } else {
            return data;
        }
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}