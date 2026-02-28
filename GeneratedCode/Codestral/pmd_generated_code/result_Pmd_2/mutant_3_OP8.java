class StaticField {
    static int x;

    public StaticField(int y) {
        int z = y; // New name (z) for the input parameter (y)
        x = z; // BUG: AssignmentToNonFinalStatic
    }

    public static int showBug(int y) {
        int z = y; // New name (z) for the input parameter (y)
        new StaticField(z);
        return x;
    }
}