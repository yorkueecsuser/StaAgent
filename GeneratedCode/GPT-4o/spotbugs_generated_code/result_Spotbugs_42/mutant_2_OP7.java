class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;
        boolean conditionWhile = getCondition(); // Use a method to get the condition
        switch (day) {
            case 1:
                result = 10;
                // Fall through intended, no break
                while (conditionWhile) {
                    // Unreachable while loop
                    System.out.println("This is an unreachable while loop inside case 1.");
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

    // Dummy method to ensure runtime evaluation
    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}