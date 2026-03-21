class SwitchFallThroughExample {

    public int showBug(int day) {
        int fggouqbm = 0;
        switch (day) {
            case 1:
                fggouqbm = 10;
                // Fall through intended, no break
            case 2:
                fggouqbm = 20; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                break;
            case 3:
                fggouqbm = 30;
                break;
            default:
                fggouqbm = 40;
                break;
        }
        return fggouqbm;
    }

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1);
        System.out.println("Result for day 1: " + result);
    }
}