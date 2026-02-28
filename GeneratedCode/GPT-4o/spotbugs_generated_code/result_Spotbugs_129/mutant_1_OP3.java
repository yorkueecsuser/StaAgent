class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable because condition is always false.");
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if statement unreachable.
        return false;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}