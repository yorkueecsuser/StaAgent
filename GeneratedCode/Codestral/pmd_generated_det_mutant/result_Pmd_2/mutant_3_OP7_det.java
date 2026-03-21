class StaticField {
    static int x;

    public StaticField(int y) {
        boolean mqvmpsxu = false;while (mqvmpsxu && false && false && false && true && false && true && false && true && true && false && false) {long tdyllgxn = -37318349;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}