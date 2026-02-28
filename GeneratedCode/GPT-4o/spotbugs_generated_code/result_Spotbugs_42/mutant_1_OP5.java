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
        
        // Inserting an unreachable switch statement
        // The condition `impossibleCase` is always false at runtime
        int impossibleValue = -1;
        switch (impossibleValue) {
            case 0:
                System.out.println("This will never be printed.");
                break;
            case 1:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Nor this.");
                break;
        }
        
        return result;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}