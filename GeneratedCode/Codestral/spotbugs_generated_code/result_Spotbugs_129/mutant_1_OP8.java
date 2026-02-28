class ShiftBug {
    public int showBug(int a, int b) {
        return a << 8 + b; // original bug remains
    }

    public int showMutant(int x, int y) {
        return x << 8 + y; // added mutant code, renaming variables to 'a' and 'b'
    }
}