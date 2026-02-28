class BadShiftAmountBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutation Operator: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable if branch");
        } else {
            // This else block is also unreachable
            System.out.println("This is an unreachable else branch");
        }

        return shiftedNumber;
    }
}