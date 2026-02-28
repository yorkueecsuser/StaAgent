class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;
        switch (day) {
            case 1:
                result = 10;
                // Fall through intended, no break
            case 2:
                result = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                result = 30;
                break;
            default:
                result = 40;
                break;
        }

        // Mutation Operator: Unreachable if statement
        boolean isConditionFalse = getFalseCondition();
        if (isConditionFalse) {
            System.out.println("This line is unreachable.");
        }

        return result;
    }

    // Helper method to provide a non-final false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}