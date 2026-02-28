class MutableStaticBug {
    // A mutable static field that can be changed accidentally or maliciously
    public static int mutableValue = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    // Method to demonstrate how the bug can be triggered
    public static int showBug(int a) { // Renamed newValue to a
        // Change the static field from an external method
        mutableValue = a;
        return mutableValue;
    }

    public static void main(String[] args) {
        // Initial value
        System.out.println("Initial mutableValue: " + mutableValue);
        
        // Demonstrating the bug by changing the static field
        int b = showBug(42); // Renamed returnedValue to b
        
        // New value after change
        System.out.println("New mutableValue after showBug: " + b);
    }
}