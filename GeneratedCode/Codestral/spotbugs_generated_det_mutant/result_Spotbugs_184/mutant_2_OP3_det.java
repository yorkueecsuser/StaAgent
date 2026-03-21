class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        if (false && true && true && true && false && true && true && true && true && false && false) {long hxcvhvaq = -712704519;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}