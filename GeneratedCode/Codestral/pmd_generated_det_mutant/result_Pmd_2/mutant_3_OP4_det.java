class StaticField {
    static int x;

    public StaticField(int y) {
        if (true && true && false && true && true && false && true && true && false && true && false) {float wmqhdgpd = -768944026;}else{float bjhfhpee = 699153471;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}