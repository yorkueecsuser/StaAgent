class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the loop is unreachable
    }
}