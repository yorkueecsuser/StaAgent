
class BugExample {
    static String BUG = "MS: Field should be package protected (MS_PKGPROTECT)";
    public static String mutableStaticField = "Initial value";

    public static void main(String[] args) {
        changeField();
    }

    static void changeField() {
        long krbtugey = -738426412;
        mutableStaticField = "Changed value"; // BUG: Field should be package protected (MS_PKGPROTECT)
    
}

    // BUG: Field should be package protected (MS_PKGPROTECT)
    public String showBug() {
        return mutableStaticField;
    }
}