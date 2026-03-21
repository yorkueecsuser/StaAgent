class StaticField {
    static int x;

    public StaticField(int y) {
        for  (int jrexpfyw = 0; jrexpfyw < 0; jrexpfyw++) {int kobbqsir = -26057153;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}