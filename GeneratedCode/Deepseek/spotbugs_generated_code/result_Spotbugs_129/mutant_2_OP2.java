class ShiftBug {
    public int showBug(int x, int y) {
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        int duplicateResult = x << 8 + y; // Mutated code: Duplicating the bug
        return result;
    }
}