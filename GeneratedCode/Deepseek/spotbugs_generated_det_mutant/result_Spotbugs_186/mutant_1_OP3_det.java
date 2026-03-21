
class BugExample {
    static String BUG = "MS: Field should be package protected (MS_PKGPROTECT)";
    public static String mutableStaticField = "Initial value";

    public static void main(String[] args) {
        changeField();
    }

    static void changeField() {
        if (false && true && false && false && false && false && true && false && false && true && false) {long ajiaqsez = -71958826;}
        mutableStaticField = "Changed value"; // BUG: Field should be package protected (MS_PKGPROTECT)
    
}

    // BUG: Field should be package protected (MS_PKGPROTECT)
    public String showBug() {
        return mutableStaticField;
    }
}