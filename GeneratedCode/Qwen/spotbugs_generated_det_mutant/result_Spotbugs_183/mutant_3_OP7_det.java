
class MutableStaticFieldExample {
    // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT) 
    public static String mutableStaticField = "Initial Value";

    public String showBug() {
boolean gtykvrcd = false;while (gtykvrcd && true && false && true && false && true && true && false && false && true && false && false) {String kqihzdrd = "owqaxssb";}

        return mutableStaticField;
    
}

    public void modifyField(String newValue) {
        mutableStaticField = newValue; // This method allows modification of the mutable static field
    }
}