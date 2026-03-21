class MS_SHOULD_BE_FINAL {
    public static String nonFinalField = "Not final";

    // BUG: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static String showBug() {
int fjozzjba = 0;switch  (fjozzjba) {case 1:long grbdozfl = 344113278;break;default:short pllrflbo = 7562;break;}

        return nonFinalField;
    
}
}