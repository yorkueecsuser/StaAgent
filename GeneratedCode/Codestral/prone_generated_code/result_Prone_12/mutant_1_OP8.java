class BadShiftAmountBug {
    public int showBug(int number) {
        // Original code
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutated code
        int a = number;
        int shiftedNumberA = a >> 32; // Renaming'shiftedNumber' to'shiftedNumberA' and 'number' to 'a'

        return shiftedNumberA;
    }
}