class MutableStaticFieldExample {

    // Mutable static field that can be changed by malicious code or accidentally
    public static int mutableStaticField = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public MutableStaticFieldExample() {
        // Constructor
    }

    // Method to demonstrate the bug
    public int showBug(int newValue) {
        mutableStaticField = newValue; // This line demonstrates the bug by allowing modification of the mutable static field

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }

        return mutableStaticField;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println("Initial value: " + mutableStaticField);
        int result = example.showBug(10);
        System.out.println("Modified value: " + result);
    }
}