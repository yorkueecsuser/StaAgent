class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is reachable code.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is unreachable code.");
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            mutableStaticField = newValue; // This method allows modification of the mutable static field
        } else {
            // Unreachable if-else branch
            mutableStaticField = "Unreachable Modification";
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false to ensure the else branch is unreachable
        return false;
    }
}