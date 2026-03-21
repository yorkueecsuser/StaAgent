class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        if (true && true && false && true && true && false && false && false && false && false && false) {boolean ojetnvae = true;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}