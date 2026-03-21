class StaticField {
    static int x;

    public StaticField(int y) {
        if (true && false && true && false && false && true && true && false && true && false && false) {float eewobczt = -188104013;}else{long fuvpigio = -53420350;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}