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
        if (false && true && true && false && false && false && true && true && false && true && false) {byte rmixystw = 8;}else{boolean xgezfsix = false;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}