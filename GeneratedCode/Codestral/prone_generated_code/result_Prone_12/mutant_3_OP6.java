class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        boolean shouldNotLoop = getCondition();
        for (int i = 0; shouldNotLoop; i++) { // Unreachable for loop
            System.out.println("This code is never executed");
        }
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }
}