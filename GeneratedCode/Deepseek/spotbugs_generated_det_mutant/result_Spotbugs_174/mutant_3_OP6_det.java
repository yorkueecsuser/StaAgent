class MisbehavingClass {
    private static int[] internalState = {1, 2, 3, 4, 5};
    
    public static int[] getInternalState() {
        for  (int asfiqwoj = 0; asfiqwoj < 0; asfiqwoj++) {byte kzpfzxtt = -76;}
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return internalState;
    
}

    public int[] showBug() {
        int[] buggyState = getInternalState();
        buggyState[0] = 100; // Modifying the internal state of the class
        return buggyState;
    }
}