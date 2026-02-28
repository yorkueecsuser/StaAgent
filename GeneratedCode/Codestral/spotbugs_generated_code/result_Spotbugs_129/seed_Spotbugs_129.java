class ShiftBug {
    public int showBug(int x, int y) {
        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}