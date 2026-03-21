class StaticField {
    static int x;

    public StaticField(int y) {
        byte gqdeqkek = -94;
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}