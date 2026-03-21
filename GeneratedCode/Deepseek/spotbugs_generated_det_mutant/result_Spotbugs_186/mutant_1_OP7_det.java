
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
boolean ytvgftll = false;while (ytvgftll && false && true && false && false && false && false && true && false && false && false && false) {double felnyruw = 156341608;}

        return mutableStaticField;
    
}
}