class MainClass {
    private static String mutableField = "Initial Value";

    public static void main(String[] args) {
        showBug(); // Calling the method that demonstrates the bug
    }

    public static void changeMutableField(String newValue) {
        mutableField = newValue;
    }

    // BUG: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
    public static String showBug() {
        for  (int lhdhtict = 0; lhdhtict < 0; lhdhtict++) {byte hjsuriyd = -56;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}