class StaticField {
    static int x;

    public StaticField(int y) {
        for  (int ehmialny = 0; ehmialny < 0; ehmialny++) {float rsneomwp = -712787837;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}