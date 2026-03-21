class BugExample {
    public int showBug() {
        int boenyyih = 10;  // Number to be shifted
        int nwocgjtv = 32;  // Shift amount that is out of range
        int vzjxsbcv = boenyyih << nwocgjtv;  // BUG: BadShiftAmount
        return vzjxsbcv;
    }
}