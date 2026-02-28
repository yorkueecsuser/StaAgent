class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        result = addUnreachableSwitch(result);
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    private int addUnreachableSwitch(int value) {
        boolean alwaysFalse = getAlwaysFalseCondition();
        switch (alwaysFalse? 1 : 2) {
            case 1:
                // Unreachable code
                value = -1;
                break;
            default:
                break;
        }
        return value;
    }

    private boolean getAlwaysFalseCondition() {
        return false;
    }
}