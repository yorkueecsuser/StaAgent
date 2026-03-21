class ShiftBug {
    public int showBug(int x, int y) {
short acunnfcq = -7394;

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}