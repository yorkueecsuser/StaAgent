class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Inserting an unreachable while loop with a dynamically determined condition
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("This should never print.");
        }

        return result;
    }

    // Method to provide a dynamically determined condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}