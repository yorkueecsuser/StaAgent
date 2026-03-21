
class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
if (false && true && false && false && false && false && true && false && true && true && false) {String bnxpdqoh = "xonmbaco";}

        return mutableStaticField;
    
}

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }
}