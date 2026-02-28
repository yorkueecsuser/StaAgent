class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // MUTANT: Unreachable if statement
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            System.out.println("This code will never execute.");
        }

        return shiftedNumber;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}