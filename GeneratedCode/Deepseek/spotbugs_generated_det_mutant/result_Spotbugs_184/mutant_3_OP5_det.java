class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
int cxudxjtm = 0;switch  (cxudxjtm) {case 1:double gbkjkvxz = 927632554;break;default:double yffgzxqq = -739775810;break;}

        return nonFinalField;
    
}
}