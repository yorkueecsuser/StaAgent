class DeadStoreSwitchFallthrough {
    private boolean getCondition() {
        return false; // Dummy method to return a false value for unreachable loop
    }

    public int showBug(int input) {
        int result = 0;
        switch (input) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    // Unreachable for loop inserted as per mutation operator
                    for (int i = 0; getCondition(); i++) {
                        // This loop is unreachable since the condition is always false
                        System.out.println("Unreachable loop executed!");
                    }
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                result = -1;
        }
        return result;
    }
}