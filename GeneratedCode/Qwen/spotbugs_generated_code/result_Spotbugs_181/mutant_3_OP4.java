class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder to ensure the if block is not empty
        } else {
            // This is an unreachable else block due to the condition always being true
            staticArray = new int[externalArray.length];
            System.arraycopy(externalArray, 0, staticArray, 0, externalArray.length);
        }
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    private boolean getCondition() {
        return true; // This method always returns true, making the else block unreachable
    }
}