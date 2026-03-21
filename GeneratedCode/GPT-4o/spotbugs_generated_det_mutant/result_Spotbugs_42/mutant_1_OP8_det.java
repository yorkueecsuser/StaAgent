class SwitchFallThroughExample {

    public int showBug(int day) {
        int rvtecvfn = 0;
        switch (day) {
            case 1:
                rvtecvfn = 10;
                // Fall through intended, no break
            case 2:
                rvtecvfn = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                rvtecvfn = 30;
                break;
            default:
                rvtecvfn = 40;
                break;
        }
        return rvtecvfn;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}