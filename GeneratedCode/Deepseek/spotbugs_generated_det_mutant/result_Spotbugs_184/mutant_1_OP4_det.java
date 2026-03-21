class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
if (false && false && false && false && true && true && true && true && true && false && false) {double msgszkmr = -387041837;}else{int raordzxo = 671041240;}

        return nonFinalField;
    
}
}