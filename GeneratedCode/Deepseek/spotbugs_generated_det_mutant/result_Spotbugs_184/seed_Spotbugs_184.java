class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
        return nonFinalField;
    }
}