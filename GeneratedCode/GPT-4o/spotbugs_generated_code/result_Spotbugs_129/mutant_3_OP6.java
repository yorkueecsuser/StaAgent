class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Introducing an unreachable for loop mutation
        boolean runLoop = determineRunLoopCondition();
        for (int i = 0; runLoop; i++) {
            // This loop is unreachable due to the false condition
            System.out.println("This code is unreachable.");
        }
        
        return result;
    }
    
    public static boolean determineRunLoopCondition() {
        // Returns a false value ensuring the for loop is unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}