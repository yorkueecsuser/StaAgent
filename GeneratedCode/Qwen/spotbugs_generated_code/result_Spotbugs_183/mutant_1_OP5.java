class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                mutableStaticField = "Unreachable Case";
                break;
            case 1:
                // This is the only reachable case
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to 1
        return false;
    }
}