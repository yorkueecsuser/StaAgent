class ShiftBug {
    public int showBug(int x, int y) {
        int z = x; // Mutant: Renaming variable 'x' to 'z'
        return z << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}