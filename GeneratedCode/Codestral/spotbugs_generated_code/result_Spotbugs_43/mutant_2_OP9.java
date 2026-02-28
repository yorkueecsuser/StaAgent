class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        boolean condition = true;
        do {
            if (input == 1) {
                result = 10;
            } else if (input == 2) {
                throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
            } else {
                result = -1;
            }
            condition = false;
        } while (condition);
        return result;
    }
}