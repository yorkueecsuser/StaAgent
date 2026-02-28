// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug
// Added mutant: Renamed variable 'newData' to'renamedData'

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String renamedData) {
        // This method in a different package can modify the static field 'data'
        data = renamedData;
    }
}