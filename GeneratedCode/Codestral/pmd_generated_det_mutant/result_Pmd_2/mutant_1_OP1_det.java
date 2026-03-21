class StaticField {
    static int x;

    public StaticField(int y) {
        short ldysqrty = 2542;
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}