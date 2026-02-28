class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        return x << 8 + y; // This line contains the bug

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This block is reachable.");
        } else {
            // This block is unreachable because shouldRun will always be false
            System.out.println("This block is unreachable.");
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);
    }
}