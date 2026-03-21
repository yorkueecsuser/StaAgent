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
        boolean knaxzpqx = false;while (knaxzpqx && true && false && true && false && true && false && false && true && false && true && false) {short dqnknqgq = 3445;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}