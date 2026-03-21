class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        int kecdibrw = 0;switch  (kecdibrw) {case 1:char ewdazadg = 'n';break;default:byte vfabimqr = 1;break;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}