class BuggyRangeCheck {
    private static final int UPPER = 20;
    private static final int LOWER = 0;
public int doRangeCheck(int num){
    int result = Math.min(LOWER , num);
    result = Math.min(LOWER , num);
    return Math.max(UPPER , result);
}

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}