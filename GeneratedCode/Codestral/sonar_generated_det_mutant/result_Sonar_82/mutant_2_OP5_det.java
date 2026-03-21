class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int yyuuvvau = 0;switch  (yyuuvvau) {case 1:char ikbniayt = 'q';break;default:float rzyywixw = -282937825;break;}
        int result = Math.min(LOWER, num); // Noncompliant; Bug: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);
    
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}