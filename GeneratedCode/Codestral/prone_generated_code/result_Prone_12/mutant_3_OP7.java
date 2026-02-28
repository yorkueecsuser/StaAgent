class BadShiftAmountBug {
    public int showBug(int number) {
        // Original code
        int shiftedNumber = number >> 32;

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }

        return shiftedNumber;
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}