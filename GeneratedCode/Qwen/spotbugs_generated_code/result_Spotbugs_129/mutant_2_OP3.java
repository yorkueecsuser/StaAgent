class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY) 
        return x << 8 + y; // This line contains the bug

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block.");
        }
    }

    // Method to provide a dynamic condition for the if statement
    private boolean getCondition() {
        return false; // This will ensure the condition is always false at runtime
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);
    }
}