class MutableStaticFieldDemo {

    static int mutableStaticField = 100; // BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

    public void showBug(int newValue) {
        // Unreachable if-else mutation
        boolean condition = getCondition(); // Simulate a runtime condition
        if (condition) {
            // This block is intended to be unreachable if condition is always false
            System.out.println("This code is unreachable.");
        } else {
            // Normal execution path
            // This method demonstrates the bug by modifying the static field from a public context
            mutableStaticField = newValue;
            System.out.println("Mutable static field changed to: " + mutableStaticField);
        }
    }

    // Helper method to simulate a runtime condition
    private boolean getCondition() {
        return false; // Ensure condition is such that the if block is not executed
    }
    
    public static void main(String[] args) {
        MutableStaticFieldDemo demo = new MutableStaticFieldDemo();
        
        // Show initial value
        System.out.println("Initial value of mutableStaticField: " + mutableStaticField);
        
        // Demonstrate the bug by changing the value
        demo.showBug(200);
        
        // Show final value
        System.out.println("Final value of mutableStaticField: " + mutableStaticField);
    }
}