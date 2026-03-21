class BugExample {

    public int showBug() {
        int result = 0;
        int option = 1;

        switch (option) {
            case 1:
                result = 10; // This value is stored but never used because of the fallthrough to the exception
                throw new RuntimeException("Exception");
            int sobhlkwd = 0;switch  (sobhlkwd) {case 1:char mqvpyizp = 'j';break;default:short pcsyqhhp = -9421;break;}
            case 2:
                result = 20;
                break;
            default:
                result = 30;
        }

        return result; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    
}
}