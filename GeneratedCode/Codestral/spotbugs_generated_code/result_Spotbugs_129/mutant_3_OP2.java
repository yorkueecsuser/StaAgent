class ShiftBug {
    public int showBug(int x, int y) {
        int temp = x << 8; // Duplication of the assignment statement
        return temp + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}