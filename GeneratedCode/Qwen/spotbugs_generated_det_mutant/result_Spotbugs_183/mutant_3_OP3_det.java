
class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
if (false && false && false && true && false && true && true && true && false && false && false) {float cjrkufyl = -483998497;}

        return mutableStaticField;
    
}

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }
}