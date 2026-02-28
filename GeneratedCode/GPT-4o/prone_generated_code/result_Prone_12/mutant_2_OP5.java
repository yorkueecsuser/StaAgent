class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Insert an unreachable switch statement
        int unreachableValue = getSwitchCondition(); // Use dynamic value
        switch (unreachableValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            // Add more cases if necessary
            default:
                // This will always execute as unreachableValue is not 1 or 2
                System.out.println("This is the default case");
                break;
        }
        
        return result;
    }

    // Dynamic method to ensure runtime evaluation
    private int getSwitchCondition() {
        return 0; // Always returns 0, making other cases unreachable
    }

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}