class SwitchFallThroughExample {

    public int showBug(int day) {
        int r = 0; // Renamed variable 'result' to 'r'
        switch (day) {
            case 1:
                r = 10;
                // Fall through intended, no break
            case 2:
                r = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                r = 30;
                break;
            default:
                r = 40;
                break;
        }
        return r; // Return renamed variable 'r'
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int r = example.showBug(1); // Renamed variable 'result' to 'r'
        System.out.println("Result for day 1: " + r); // Print renamed variable 'r'
    }
}