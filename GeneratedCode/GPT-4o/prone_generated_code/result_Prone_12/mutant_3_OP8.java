class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount
        return result;
    }

    // Mutant method with renamed variable
    public int showBugMutant(int n, int sa) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int r = n << sa; // BUG: BadShiftAmount
        return r;
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
        
        // Calling the mutant method
        int mutantResult = demo.showBugMutant(number, shiftAmount);
        System.out.println("Mutant result of shifting " + number + " by " + shiftAmount + " is: " + mutantResult);
    }
}