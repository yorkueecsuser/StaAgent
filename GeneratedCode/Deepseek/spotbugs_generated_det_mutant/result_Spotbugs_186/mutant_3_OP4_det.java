
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
if (true && false && true && false && true && true && true && true && false && false && false) {double lelsfbmg = -794742033;}else{short joiblouv = -4511;}

        return mutableStaticField;
    
}
}