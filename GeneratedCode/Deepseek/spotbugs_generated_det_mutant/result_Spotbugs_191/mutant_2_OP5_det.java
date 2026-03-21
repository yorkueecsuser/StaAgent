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
        int nxtcaalv = 0;switch  (nxtcaalv) {case 1:short oxrlbbmd = 3334;break;default:char dcgqyros = 'k';break;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}