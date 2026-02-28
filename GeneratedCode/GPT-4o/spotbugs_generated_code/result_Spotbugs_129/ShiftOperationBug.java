class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Unreachable while loop using a non-final condition to avoid compile-time errors
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is intended to be unreachable
            System.out.println("This line is unreachable.");
        }
        
        return result;
    }
    
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}