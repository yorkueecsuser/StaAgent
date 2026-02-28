class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Inserting an unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable due to the false condition
            System.out.println("This is an unreachable code block.");
        }

        return result;
    }

    private boolean getFalseCondition() {
        // Return a constant false condition for the unreachable code
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