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
        int oqcqdabe = 0;switch  (oqcqdabe) {case 1:short cqskyqpc = -5153;break;default:long kzcmqkka = -107288055;break;}
        changeMutableField("Changed!");
        return mutableField;
    
}
}