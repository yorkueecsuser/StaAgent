class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Unreachable for loop added as per mutation operator instructions
        boolean conditionFor = getCondition(); // Determine condition dynamically
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
            System.out.println("This is an unreachable for loop.");
        }

        return result;
    }

    // Method to simulate a runtime condition for the loop
    private boolean getCondition() {
        return false; // This makes the loop condition always false at runtime
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}