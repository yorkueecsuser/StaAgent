class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // MUTANT: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }

        return shiftedNumber;
    }

    // Method to return the condition for the while loop
    private boolean getCondition() {
        return false;
    }
}