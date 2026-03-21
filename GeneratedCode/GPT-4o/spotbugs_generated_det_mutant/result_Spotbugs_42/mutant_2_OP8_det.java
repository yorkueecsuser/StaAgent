class SwitchFallThroughExample {

    public int showBug(int day) {
        int jqwutifk = 0;
        switch (day) {
            case 1:
                jqwutifk = 10;
                // Fall through intended, no break
            case 2:
                jqwutifk = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                jqwutifk = 30;
                break;
            default:
                jqwutifk = 40;
                break;
        }
        return jqwutifk;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}