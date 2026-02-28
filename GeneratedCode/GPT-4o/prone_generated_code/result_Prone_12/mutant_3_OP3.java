class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount
        
        // Unreachable if statement
        boolean unreachableCondition = getAlwaysFalseCondition();
        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("This is an unreachable block.");
        }
        
        return result;
    }
    
    private boolean getAlwaysFalseCondition() {
        return false; // This simulates a condition that is always false
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}