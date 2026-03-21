class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
int oywksvwk = 0;switch  (oywksvwk) {case 1:double urvheujy = -975633223;break;default:float vesjaoak = -784279985;break;}

        return nonFinalField;
    
}
}