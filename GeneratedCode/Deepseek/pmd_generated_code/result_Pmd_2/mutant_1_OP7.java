class StaticField {
    static int x;
    public StaticField(int y) {
        x = y;
        while (false) { /* unreachable while loop */ } // mutant
    }
    public int showBug() {
        return x;
    }
    // BUG: AssignmentToNonFinalStatic
}