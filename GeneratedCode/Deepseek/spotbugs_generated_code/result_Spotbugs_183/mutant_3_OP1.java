// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug
// with the "Dead Store" mutation operator applied

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";
    // Mutation: Adding a dead store
    private String qazwsxed;

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}