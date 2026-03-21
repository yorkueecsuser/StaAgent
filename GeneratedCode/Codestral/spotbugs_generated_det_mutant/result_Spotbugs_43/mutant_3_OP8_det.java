class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int lnozddhm = 0;
        switch (input) {
            case 1:
                lnozddhm = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                lnozddhm = -1;
        }
        return lnozddhm;
    }
}