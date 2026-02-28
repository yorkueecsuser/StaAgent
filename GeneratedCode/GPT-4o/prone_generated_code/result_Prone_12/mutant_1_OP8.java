class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount
        return result;
    }

    public int showBugMutant(int number, int y) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << y; // BUG: BadShiftAmount
        return result;
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);

        // Mutant code execution
        int resultMutant = demo.showBugMutant(number, shiftAmount);
        System.out.println("Result of shifting (mutant) " + number + " by " + shiftAmount + " is: " + resultMutant);
    }
}