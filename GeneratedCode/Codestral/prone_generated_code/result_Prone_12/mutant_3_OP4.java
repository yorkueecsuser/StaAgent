class BadShiftAmountBug {
    public int showBug(int number) {
        // Original code
        int shiftedNumber = number >> 32;

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // This else block is also unreachable
            // For demonstration purposes, we will still include it
            System.out.println("This code is also unreachable.");
        }

        return shiftedNumber;
    }

    // Method to dynamically determine the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}