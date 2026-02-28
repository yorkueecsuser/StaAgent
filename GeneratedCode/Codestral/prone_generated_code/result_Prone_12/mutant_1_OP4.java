class BadShiftAmountBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int number) {
        // Original code
        int shiftedNumber = number >> 32;

        // Added unreachable if-else statement
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // This code block will never execute
            int unreachableCode = 10 / 0;  // This will cause a division by zero error if executed
        } else {
            // This is the else part of the unreachable if-else statement
            // This code block will never execute
            System.out.println("This is an unreachable code block.");
        }

        return shiftedNumber;
    }
}