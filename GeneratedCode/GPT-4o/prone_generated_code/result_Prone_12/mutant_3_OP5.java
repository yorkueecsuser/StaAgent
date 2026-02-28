class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Insert an unreachable switch statement
        int unreachableVariable = 42; // This variable is set to a constant value
        switch (unreachableVariable) {
            case 0:
                System.out.println("This is unreachable code.");
                break;
            default:
                // The default case should not execute because the switch condition is always false
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}