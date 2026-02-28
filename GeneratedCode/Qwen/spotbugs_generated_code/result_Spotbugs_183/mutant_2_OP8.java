class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    // Mutated code starts here
    private String a = "Another Value";

    public String display() {
        return a;
    }

    public void updateA(String newValue) {
        a = newValue;
    }
}