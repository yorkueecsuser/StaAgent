class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int res = 0;
        switch (input) {
            case 1:
                res = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                res = -1;
        }
        return res;
    }
}