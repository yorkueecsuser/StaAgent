class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;
        boolean conditionWhile = getCondition(); // Ensure condition is dynamically determined
        
        switch (day) {
            case 1:
                result = 10;
                // Fall through intended, no break
                while (conditionWhile) {
                    // Unreachable loop inserted, condition is always false
                }
            case 2:
                result = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                result = 30;
                break;
            default:
                result = 40;
                break;
        }
        return result;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}