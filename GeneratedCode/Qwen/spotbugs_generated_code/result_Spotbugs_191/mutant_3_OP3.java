class MutableStaticFieldExample {

    // Mutable static field that can be changed by malicious code or accidentally
    public static int mutableStaticField = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public MutableStaticFieldExample() {
        // Constructor
    }

    // Method to demonstrate the bug
    public int showBug(int newValue) {
        mutableStaticField = newValue; // This line demonstrates the bug by allowing modification of the mutable static field
        return mutableStaticField;
    }

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println("Initial value: " + mutableStaticField);
        int result = example.showBug(10);
        System.out.println("Modified value: " + result);

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            mutableStaticField = 999; // This line is unreachable
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method returns false, making the if block unreachable
    }
}