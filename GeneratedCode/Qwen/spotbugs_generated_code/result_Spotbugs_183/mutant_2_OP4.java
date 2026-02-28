class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            mutableStaticField = "Unreachable Code";
        } else {
            // Alternative code that should also never run
            mutableStaticField = "Another Unreachable Code";
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}