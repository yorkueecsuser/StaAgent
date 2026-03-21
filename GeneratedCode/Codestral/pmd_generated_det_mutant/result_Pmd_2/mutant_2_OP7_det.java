class StaticField {
    static int x;

    public StaticField(int y) {
        boolean rwzzkpdf = false;while (rwzzkpdf && false && false && true && true && false && true && false && false && false && true && false) {boolean ioeoprxt = true;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}