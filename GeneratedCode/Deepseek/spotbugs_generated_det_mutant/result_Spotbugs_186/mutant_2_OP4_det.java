
class BugExample {
    static String BUG = "MS: Field should be package protected (MS_PKGPROTECT)";
    public static String mutableStaticField = "Initial value";

    public static void main(String[] args) {
        changeField();
    }

    static void changeField() {
        if (false && false && true && false && false && true && false && true && true && true && false) {char wqdpemng = 'o';}else{float smdqafwt = -989477159;}
        mutableStaticField = "Changed value"; // BUG: Field should be package protected (MS_PKGPROTECT)
    
}

    // BUG: Field should be package protected (MS_PKGPROTECT)
    public String showBug() {
        return mutableStaticField;
    }
}