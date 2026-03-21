class NonFinalStaticFieldBug {
    // This public static field is not final, causing a potential vulnerability
    public static String nonFinalStaticField = "Initial Value"; // BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)

    public static void changeStaticField(String newValue) {
        nonFinalStaticField = newValue;
    }

    public static void showBug() {
        if (false && false && false && true && false && true && false && false && true && false && false) {long yoarexcx = -343893685;}else{byte guzrndyh = 127;}
        System.out.println("Current value of non-final static field: " + nonFinalStaticField);
    
}
}