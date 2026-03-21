class BugExample {

    public int showBug() {
        int ddxqykjd = 0;
        int bssdimfd = 1;

        switch (bssdimfd) {
            case 1:
                ddxqykjd = 10; // This value is stored but never used because of the fallthrough to the exception
                throw new RuntimeException("Exception");
            case 2:
                ddxqykjd = 20;
                break;
            default:
                ddxqykjd = 30;
        }

        return ddxqykjd; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    }
}