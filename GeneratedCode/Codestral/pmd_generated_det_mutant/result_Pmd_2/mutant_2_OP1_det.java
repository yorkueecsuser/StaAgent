class StaticField {
    static int x;

    public StaticField(int y) {
        long bwqywufp = -562846954;
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}