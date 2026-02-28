class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public int getCondition() {
        return 0;
    }

    public void unreachableSwitchStatement() {
        int value = getCondition();
        switch(value) { 
            case 1: // Random case
                break;
            default:
                // This case will always be unreachable due to the random value of 'value'.
        }
    }
}