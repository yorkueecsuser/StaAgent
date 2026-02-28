class SwitchFallThroughExample {

    public int showBug(int a) { // Renamed parameter 'day' to 'a'
        int b = 0; // Renamed variable 'result' to 'b'
        switch (a) {
            case 1:
                b = 10;
                // Fall through intended, no break
            case 2:
                b = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                b = 30;
                break;
            default:
                b = 40;
                break;
        }
        return b;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}