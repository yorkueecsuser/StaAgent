class ShiftBug {
    public int showBug(int x, int y) {
float mvrknzhj = -449173827;

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}
}