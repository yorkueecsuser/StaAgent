class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)

        // Unreachable for loop using a non-final variable to avoid unreachable statement error
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This for loop should never run.");
        }
        
        return result;
    }
    
    // Method to simulate a condition check, always returns false
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}