class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
if (false && true && true && false && false && false && true && false && true && true && false) {double tcytwlwq = 915104179;}else{double kwaozbgd = -963713605;}

        return nonFinalField;
    
}
}