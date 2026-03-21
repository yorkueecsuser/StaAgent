class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        int i = input;
        do {
            if(i == 1) {
                result = 10;
            } else if (i == 2) {
                throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
            } else {
                result = -1;
            }
            i--;
        } while(i > 0);
        return result;
    }
}