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

    // New method containing a do-while loop that does not affect existing functionality
    public void uniqueDoWhileLoop() {
        int count = 0;
        do {
            count++;
        } while (count < 1); // This loop runs exactly once and does not affect the existing code
    }

    public static void main(String[] args) {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        System.out.println("Initial value: " + mutableStaticField);
        int result = example.showBug(10);
        System.out.println("Modified value: " + result);
        example.uniqueDoWhileLoop(); // Call the new method containing the do-while loop
    }
}