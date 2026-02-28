class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;
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
        
        // Unreachable switch statement introduced
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 100:
                result = 50;
                break;
            case 200:
                result = 60;
                break;
            default:
                result = 70;
                break;
        }

        return result;
    }

    // Method to ensure that the unreachable switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // Value that doesn't match any case in the unreachable switch statement
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}