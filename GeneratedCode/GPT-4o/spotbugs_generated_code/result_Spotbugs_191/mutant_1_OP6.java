class MutableStaticBug {
    // A mutable static field that can be changed accidentally or maliciously
    public static int mutableValue = 0; // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    // Method to demonstrate how the bug can be triggered
    public static int showBug(int newValue) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }

        // Change the static field from an external method
        mutableValue = newValue;
        return mutableValue;
    }
    
    // Dummy method to ensure the loop is unreachable
    public static boolean getCondition() {
        return false;
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