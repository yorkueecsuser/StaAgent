class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This is another unreachable statement.");
        }
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if blocks are unreachable
    }
}