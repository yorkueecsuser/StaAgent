class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
if (true && true && false && true && true && true && false && false && true && false && false) {int nkdnwydh = 239120420;}

        return nonFinalField;
    
}
}