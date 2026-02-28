class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will be false
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }
}