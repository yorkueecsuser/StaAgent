class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
        return mutableStaticField;
    }

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }

    // Example of where a loop might exist and be replaced (for demonstration purposes, not part of the original code)
    // Original code:
    // for (int i = 0; i < 5; i++) {
    //     System.out.println(i);
    // }

    // Mutated code (if the loop existed):
    // int i = 0;
    // do {
    //     System.out.println(i);
    //     i++;
    // } while (i < 5);
}