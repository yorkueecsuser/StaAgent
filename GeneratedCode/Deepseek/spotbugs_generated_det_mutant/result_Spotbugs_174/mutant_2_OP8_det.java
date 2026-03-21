class MisbehavingClass {
    private static int[] internalState = {1, 2, 3, 4, 5};
    
    public static int[] getInternalState() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return internalState;
    }

    public int[] showBug() {
        int[] avmilgfo = getInternalState();
        avmilgfo[0] = 100; // Modifying the internal state of the class
        return avmilgfo;
    }
}