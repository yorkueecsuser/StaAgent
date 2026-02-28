class BitwiseBug {
    public boolean showBug(int number) {
        int tempNumber = number; // Mutated code: Introduced a new variable
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((tempNumber & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
}