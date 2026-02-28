class ShiftBug {
    public int showBug(int x, int y) {
        int z = 8 + y;
        return x << z; // Mutation: Renamed 'y' to 'z' for the shift operation to follow the original bug
    }
}