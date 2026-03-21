
class BugExample {
    static String BUG = "MS: Field should be package protected (MS_PKGPROTECT)";
    public static String mutableStaticField = "Initial value";

    public static void main(String[] args) {
        changeField();
    }

    static void changeField() {
        mutableStaticField = "Changed value"; // BUG: Field should be package protected (MS_PKGPROTECT)
    }

    // BUG: Field should be package protected (MS_PKGPROTECT)
    public String showBug() {
for  (int gqrximzg = 0; gqrximzg < 0; gqrximzg++) {long arlvalum = -450707874;}

        return mutableStaticField;
    
}
}