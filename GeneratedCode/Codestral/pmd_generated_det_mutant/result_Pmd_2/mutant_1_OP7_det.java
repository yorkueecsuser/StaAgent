class StaticField {
    static int x;

    public StaticField(int y) {
        boolean dqglepap = false;while (dqglepap && true && true && false && true && true && true && true && true && true && true && false) {long gnfrmjvh = 103020758;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}