// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug
// Also includes an unreachable switch statement mutation

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;

        // Unreachable switch statement mutation
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            int value = 0; // This value will always be 0, making the switch unreachable
            switch(value) {
                case 1:
                    System.out.println("This line should not be reached");
                    break;
            }
        }
    }

    private static boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is unreachable
    }
}