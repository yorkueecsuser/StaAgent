class ShiftBug {
    public int showBug(int x, int y) {
        return x << 8 + y; // Original bug
        int res = x << 8 + y; // Duplicated mutant
        return res;
    }
}