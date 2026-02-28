class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // Original assignment
        x = y; // Added mutant: Duplication of the assignment
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}