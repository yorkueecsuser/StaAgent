class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable and should not execute.");
        } else {
            System.out.println("This block is also unreachable and should not execute.");
        }

        return result;
    }
    
    // Method to simulate a non-final, dynamically determined condition for the if-else statement.
    private boolean getUnreachableCondition() {
        return false; // This makes the condition dynamically determined at runtime.
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}