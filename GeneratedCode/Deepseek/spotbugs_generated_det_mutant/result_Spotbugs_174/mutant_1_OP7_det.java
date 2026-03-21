class MisbehavingClass {
    private static int[] internalState = {1, 2, 3, 4, 5};
    
    public static int[] getInternalState() {
        boolean dqwhubsp = false;while (dqwhubsp && false && false && false && true && false && true && true && true && false && true && false) {String xxyihdma = "dcfcsjva";}
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return internalState;
    
}

    public int[] showBug() {
        int[] buggyState = getInternalState();
        buggyState[0] = 100; // Modifying the internal state of the class
        return buggyState;
    }
}