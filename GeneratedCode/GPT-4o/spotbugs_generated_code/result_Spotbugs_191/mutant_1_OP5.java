class MutableStaticBug {
    // A mutable static field that can be changed accidentally or maliciously
    public static int mutableValue = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    // Method to demonstrate how the bug can be triggered
    public static int showBug(int newValue) {
        // Change the static field from an external method
        mutableValue = newValue;
        
        // Inserting unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("Default case that never executes.");
        }

        return mutableValue;
    }

    // Helper method to simulate a condition that leads to an unreachable switch statement
    public static int getUnreachableCondition() {
        return 0; // Always returns 0, so the switch cases are unreachable
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