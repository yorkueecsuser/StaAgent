class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Introduce an unreachable if-else branch
        boolean condition = getCondition(); // Using a method call to introduce a condition
        if (condition) {
            // This block is theoretically reachable but practically never executed
            System.out.println("Unreachable if branch reached.");
        } else {
            // This is the regular execution flow
            System.out.println("Regular execution continues.");
        }

        return result;
    }

    // Method that returns a condition dynamically
    private boolean getCondition() {
        return false; // Ensures the if branch is unreachable at runtime
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}