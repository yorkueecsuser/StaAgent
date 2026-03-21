class StaticField {
    static int x;

    public StaticField(int y) {
        int wbjvzjgr = 0;switch  (wbjvzjgr) {case 1:boolean abournhj = false;break;default:short nygspmcg = -6745;break;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}