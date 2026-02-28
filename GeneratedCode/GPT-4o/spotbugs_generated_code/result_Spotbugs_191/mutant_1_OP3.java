class MutableStaticBug {
    // A mutable static field that can be changed accidentally or maliciously
    public static int mutableValue = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    // A method to simulate dynamic condition for unreachable if statement
    private static boolean getCondition() {
        return false;
    }

    // Method to demonstrate how the bug can be triggered
    public static int showBug(int newValue) {
        // Unreachable if statement added here
        if (getCondition()) {
            System.out.println("This is an unreachable statement due to the condition being false.");
        }
        
        // Change the static field from an external method
        mutableValue = newValue;
        return mutableValue;
    }

    public static void main(String[] args) {
        // Initial value
        System.out.println("Initial mutableValue: " + mutableValue);
        
        // Demonstrating the bug by changing the static field
        int returnedValue = showBug(42);
        
        // New value after change
        System.out.println("New mutableValue after showBug: " + returnedValue);
    }
}