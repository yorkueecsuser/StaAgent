// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug

class MutableStaticFieldBug {
    static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }

    // Mutant code added using the Equivalent Loop Replacement operator
    public static void loopExample() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}