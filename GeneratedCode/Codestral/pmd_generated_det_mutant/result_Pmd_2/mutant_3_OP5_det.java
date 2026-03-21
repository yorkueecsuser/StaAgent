class StaticField {
    static int x;

    public StaticField(int y) {
        int zddmxdjg = 0;switch  (zddmxdjg) {case 1:int hpnxefla = 100391612;break;default:char mehjidxw = 'o';break;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}