class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public void unreachableSwitchMethod() {
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // this code is unreachable
                    break;
            }
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    private int getValue() {
        // This method returns a value that is never 1 to make the switch statement unreachable
        return 0;
    }
}