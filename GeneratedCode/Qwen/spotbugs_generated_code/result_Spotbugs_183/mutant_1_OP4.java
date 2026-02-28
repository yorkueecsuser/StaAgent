class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if the condition is true
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else block.");
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            mutableStaticField = newValue; // This method allows modification of the mutable static field
        } else {
            // Unreachable if-else branch
            System.out.println("This is another unreachable else block.");
        }
    }

    private boolean getCondition() {
        return false; // This method will always return false, making the else blocks unreachable
    }
}