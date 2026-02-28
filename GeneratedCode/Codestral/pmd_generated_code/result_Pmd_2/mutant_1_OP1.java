class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
        int deadStore = 0; // Added this line for the Dead Store Mutation Operator
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}