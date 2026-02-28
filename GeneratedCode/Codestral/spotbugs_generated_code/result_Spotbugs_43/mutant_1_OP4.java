class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        switch (input) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
                if (getCondition()) {
                    // This branch is unreachable due to getCondition() always returning false
                    result = -2;
                } else {
                    // This branch is also unreachable
                    result = -3;
                }
            default:
                result = -1;
        }
        return result;
    }

    private boolean getCondition() {
        return false;
    }
}