class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount
        
        // Unreachable switch statement mutant
        int unreachableSwitchCondition = getUnreachableValue();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // Default case can be left empty or log a message
                break;
        }
        
        return result;
    }

    // Helper method to ensure switch is unreachable
    private int getUnreachableValue() {
        return 0; // This ensures that the switch never reaches case 1
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}