class StaticField {
    static int x;
    static int z; // Mutant: Renamed 'x' to 'z'

    public StaticField(int y) {
        z = y; // Mutant: Assigned 'y' to 'z' instead of 'x'
    }

    public static int showBug(int y) {
        new StaticField(y);
        return z; // Mutant: Returned 'z' instead of 'x'
    }
}