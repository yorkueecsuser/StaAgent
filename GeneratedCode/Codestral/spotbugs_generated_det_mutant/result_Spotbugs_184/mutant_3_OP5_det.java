class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        int gymlfsgn = 0;switch  (gymlfsgn) {case 1:byte zzfssxvl = 8;break;default:int toiqmiwh = -887587698;break;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}