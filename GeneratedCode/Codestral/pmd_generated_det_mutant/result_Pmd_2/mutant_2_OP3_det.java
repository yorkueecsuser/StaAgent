class StaticField {
    static int x;

    public StaticField(int y) {
        if (true && false && false && true && true && false && false && true && false && false && false) {long xoeidasm = 173083262;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}