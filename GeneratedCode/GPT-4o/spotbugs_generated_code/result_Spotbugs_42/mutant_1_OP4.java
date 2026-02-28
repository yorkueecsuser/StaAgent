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

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the unreachable else branch.");
        }

        return result;
    }

    // Method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // This method can be changed to return true to test reachability
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}