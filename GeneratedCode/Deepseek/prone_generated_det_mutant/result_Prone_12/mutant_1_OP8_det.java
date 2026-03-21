class BugExample {
    public int showBug() {
        int khnxipgp = 10;  // Number to be shifted
        int zrrsouam = 32;  // Shift amount that is out of range
        int fqfehhfa = khnxipgp << zrrsouam;  // BUG: BadShiftAmount
        return fqfehhfa;
    }
}