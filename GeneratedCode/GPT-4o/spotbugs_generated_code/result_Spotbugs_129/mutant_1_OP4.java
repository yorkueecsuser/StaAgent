class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Here, we introduce an unreachable if-else statement to demonstrate mutation.
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute
            System.out.println("Condition is true - this should never print");
        } else {
            // This block will always execute
            System.out.println("Condition is false - this will always print");
        }
        
        return result;
    }
    
    // A method to simulate a runtime condition, always returning false
    // to ensure the if-else branch is unreachable
    private boolean getCondition() {
        return false; // Simulate a dynamically determined condition that is false
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}