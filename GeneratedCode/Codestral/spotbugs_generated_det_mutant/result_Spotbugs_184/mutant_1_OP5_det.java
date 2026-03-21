class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        int tqzkaraq = 0;switch  (tqzkaraq) {case 1:int jnbpfcbc = 624101330;break;default:byte netdpdja = -124;break;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}