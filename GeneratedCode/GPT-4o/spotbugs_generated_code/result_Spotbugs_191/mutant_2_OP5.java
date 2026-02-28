class MutableStaticBug {
    // A mutable static field that can be changed accidentally or maliciously
    public static int mutableValue = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    // Method to demonstrate how the bug can be triggered
    public static int showBug(int newValue) {
        // Change the static field from an external method
        mutableValue = newValue;
        
        // Unreachable switch statement
        int testValue = getTestValue(); // Dynamically determined at runtime
        switch (testValue) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            case 2:
                System.out.println("This code is also unreachable.");
                break;
            default:
                System.out.println("Default case is also unreachable.");
        }
        
        return mutableValue;
    }
    
    public static int getTestValue() {
        return 0; // This ensures that no case in the switch will execute
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