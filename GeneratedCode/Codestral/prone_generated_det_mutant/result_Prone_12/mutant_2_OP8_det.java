class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int lygcsjoo = number >> 32; // Shift amount is out of range, should be between 0 and 31
        return lygcsjoo;
    }
}