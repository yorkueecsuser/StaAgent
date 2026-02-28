class BadShiftAmountBug {
    public int showBug(int number) {
        // Original code
        int shiftedNumber = number >> 32;

        // Mutated code: Unreachable for loop
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }

        return shiftedNumber;
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}