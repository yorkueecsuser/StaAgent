class ShiftBug {
    public int showBug(int x, int y) {
        int i = 0;
        do {
            i++;
        } while (i < 0); // This loop does not affect the original code

        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}