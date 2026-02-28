class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement because getCondition() always returns false
            mutableStaticField = "Unreachable Value";
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    private boolean getCondition() {
        // Always returns false, making the if statement in showBug() unreachable
        return false;
    }
}