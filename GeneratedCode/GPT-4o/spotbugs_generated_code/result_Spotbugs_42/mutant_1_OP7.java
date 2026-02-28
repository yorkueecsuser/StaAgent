class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;

        // Introduce a non-final variable to avoid compile-time constant
        boolean conditionWhile = getCondition();

        // Unreachable while loop added as a mutant
        while (conditionWhile) {
            // This loop body will never be executed
            System.out.println("This code is unreachable.");
        }
        
        switch (day) {
            case 1:
                result = 10;
                // Fall through intended, no break
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
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}