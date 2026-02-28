class DeadStoreSwitchFallthrough {
    public int showBug(int inputValue) {
        int result = 0;
        switch (inputValue) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (inputValue!= 1) {
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                int renamedResult = -1; // Mutant: Renamed'result' to'renamedResult'
        }
        return result;
    }
}