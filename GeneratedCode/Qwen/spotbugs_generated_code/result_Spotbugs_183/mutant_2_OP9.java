class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    // Added a unique, non-functional do-while loop as per the mutation operator requirement
    public void dummyMethod() {
        int i = 0;
        do {
            i++;
        } while (i < 0); // This condition ensures the loop does not execute
    }
}