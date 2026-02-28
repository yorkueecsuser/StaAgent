class SwitchFallThroughExample {

    public int showBug(int day) {
        int result = 0;
        switch (day) {
            case 1:
                result = 10;
                result = 10; // Duplicated assignment
                // Fall through intended, no break
            case 2:
                result = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                result = 20; // Duplicated assignment
                break;
            case 3:
                result = 30;
                result = 30; // Duplicated assignment
                break;
            default:
                result = 40;
                result = 40; // Duplicated assignment
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