class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Inserting an unreachable while loop with a non-final variable condition
        boolean conditionWhile = isConditionFalse(); 
        while (conditionWhile) {
            // This block will never execute as conditionWhile is always false.
            System.out.println("This is an unreachable while loop.");
        }
        
        return result;
    }
    
    // Method to return false, ensuring the loop is unreachable
    private boolean isConditionFalse() {
        return false;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}