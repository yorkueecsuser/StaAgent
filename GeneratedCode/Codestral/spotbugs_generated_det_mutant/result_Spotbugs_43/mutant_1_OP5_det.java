class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        switch (input) {
            case 1:
                result = 10;
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    int oefpncew = 0;switch  (oefpncew) {case 1:String ehgfcpiq = "tsmptmbi";break;default:double cbvbsdmy = -523004258;break;}
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                result = -1;
        }
        return result;
    
}
}