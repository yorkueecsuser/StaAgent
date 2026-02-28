class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                mutableStaticField = "Unreachable Value";
                break;
            case 1:
                // This case is always executed
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement's first case unreachable
        return false;
    }
}