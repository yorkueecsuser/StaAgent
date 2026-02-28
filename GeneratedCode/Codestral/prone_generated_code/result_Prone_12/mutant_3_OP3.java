class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutant - Unreachable if statement
        if (isUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable branch");
        }

        return shiftedNumber;
    }

    private boolean isUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }
}