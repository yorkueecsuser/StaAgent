// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug
// and the "Unreachable while loop" mutation

class MutableStaticFieldBug {
    static String data = "Sensitive Data"; // Bug: No access modifier, field can be accessed from other packages

    public static String showBug() {
        boolean shouldNotRun = false;
        while (shouldNotRun) { // Mutation: Unreachable while loop
            System.out.println("This line should never execute");
        }
        return data;
    }

    public static void modifyData(String newData) {
        data = newData; // This method in a different package can modify the static field 'data'
    }
}