class StaticField {
    static int x;

    public StaticField(int y) {
        for  (int cniwaooz = 0; cniwaooz < 0; cniwaooz++) {boolean jnfmuodg = true;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}