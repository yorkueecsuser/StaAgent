class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount
        
        // Mutation: Introducing an unreachable if-else statement
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            // This block will never be executed
            System.out.println("Unreachable code block.");
        } else {
            // This block is the default and will always execute
            System.out.println("Proceeding with the calculation.");
        }

        return result;
    }

    // Method to return a false condition for the if statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}