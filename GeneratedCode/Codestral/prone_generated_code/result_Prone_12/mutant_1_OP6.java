class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // MUTATION: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never be executed because the condition is always false
            System.out.println("Unreachable code: " + i);
        }

        return shiftedNumber;
    }

    // This method is used to dynamically determine the condition for the unreachable loop
    private boolean getCondition() {
        // Replace the code below with your own logic to return false dynamically
        return false;
    }
}