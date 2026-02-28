class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        int result = number << shiftAmount; // BUG: BadShiftAmount

        // Add an unreachable if-else statement using non-final variable
        boolean executeBranch = getFalseCondition();
        if (executeBranch) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else branch, which is executed.");
        }

        return result;
    }

    private boolean getFalseCondition() {
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