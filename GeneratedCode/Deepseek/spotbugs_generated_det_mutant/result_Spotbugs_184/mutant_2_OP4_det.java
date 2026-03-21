class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
if (false && false && true && true && true && false && false && true && true && false && false) {byte qouzsojr = 27;}else{int mgysdnna = -69704393;}

        return nonFinalField;
    
}
}