class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
if (false && true && false && false && false && true && false && false && true && false && false) {double inegygco = 251596481;}

        return nonFinalField;
    
}
}