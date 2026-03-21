class StaticField {
    static int x;

    public StaticField(int y) {
        if (false && false && false && true && true && true && true && false && true && false && false) {byte kjlglzrb = 38;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}