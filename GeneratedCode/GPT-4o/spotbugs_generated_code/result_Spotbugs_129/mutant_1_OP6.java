class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Unreachable for loop based on a dynamic condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This line should never be reached.");
        }

        return result;
    }
    
    // Method to provide a dynamic condition for the loop
    private boolean getCondition() {
        return false; // Always returns false, making the for loop unreachable at runtime
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}