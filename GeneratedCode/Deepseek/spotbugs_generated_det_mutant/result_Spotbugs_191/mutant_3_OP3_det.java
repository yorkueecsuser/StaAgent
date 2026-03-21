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
        if (true && false && false && true && true && true && false && true && false && false && false) {double lgcrtsnp = 987362419;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}