class BadShiftAmountBug {
    public int showBug(int number) {
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31
        // Mutant code (Renaming): Renaming'shiftedNumber' to 'n'
        int n = number >> 32;
        return n;
    }
}