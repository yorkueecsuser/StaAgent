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
        int nukjrwfh = 0;switch  (nukjrwfh) {case 1:String iwgvqyfa = "eniblilw";break;default:char dtjvcgdz = 'k';break;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}