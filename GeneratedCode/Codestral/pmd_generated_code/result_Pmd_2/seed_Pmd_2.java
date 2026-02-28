class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}