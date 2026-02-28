class BadShiftAmountBug {
    public int showBug(int number) {
        int unreachableValue = getUnreachableValue(); // A method that always returns a value other than 1-3
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                break;
            case 2:
                // Unreachable code
                break;
            case 3:
                // Unreachable code
                break;
        }

        // Original code
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return shiftedNumber;
    }

    private int getUnreachableValue() {
        // Always return a value other than 1-3 to make the switch statement unreachable
        return 4;
    }
}