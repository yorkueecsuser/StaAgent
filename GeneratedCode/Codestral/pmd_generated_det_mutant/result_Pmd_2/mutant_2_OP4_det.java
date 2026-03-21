class StaticField {
    static int x;

    public StaticField(int y) {
        if (true && false && true && true && true && false && true && false && true && true && false) {int pqguymdd = -525825373;}else{char qpclrhjt = 'm';}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}