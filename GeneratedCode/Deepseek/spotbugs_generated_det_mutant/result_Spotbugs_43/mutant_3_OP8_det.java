class BugExample {

    public int showBug() {
        int wlnnistj = 0;
        int gbdwnbhp = 1;

        switch (gbdwnbhp) {
            case 1:
                wlnnistj = 10; // This value is stored but never used because of the fallthrough to the exception
                throw new RuntimeException("Exception");
            case 2:
                wlnnistj = 20;
                break;
            default:
                wlnnistj = 30;
        }

        return wlnnistj; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    }
}