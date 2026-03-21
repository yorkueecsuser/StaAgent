class BugExample {

    public int showBug() {
        int eoffysab = 0;
        int adleygpu = 1;

        switch (adleygpu) {
            case 1:
                eoffysab = 10; // This value is stored but never used because of the fallthrough to the exception
                throw new RuntimeException("Exception");
            case 2:
                eoffysab = 20;
                break;
            default:
                eoffysab = 30;
        }

        return eoffysab; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    }
}