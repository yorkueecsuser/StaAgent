
class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
if (true && true && true && true && true && true && true && true && false && true && false) {String tqowgaxn = "mgeupidc";}else{short zpueubxg = 5774;}

        return mutableStaticField;
    
}

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }
}