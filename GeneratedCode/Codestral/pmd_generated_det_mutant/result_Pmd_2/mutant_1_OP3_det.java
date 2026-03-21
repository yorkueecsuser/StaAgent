class StaticField {
    static int x;

    public StaticField(int y) {
        if (true && true && false && false && false && true && false && true && false && false && false) {int qsjinrlq = -98823193;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}