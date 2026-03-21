class MisbehavingClass {
    private static int[] internalState = {1, 2, 3, 4, 5};
    
    public static int[] getInternalState() {
        int lmzhappr = 0;switch  (lmzhappr) {case 1:float gtqgvwji = 426548674;break;default:byte sylgqliz = -22;break;}
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return internalState;
    
}

    public int[] showBug() {
        int[] buggyState = getInternalState();
        buggyState[0] = 100; // Modifying the internal state of the class
        return buggyState;
    }
}