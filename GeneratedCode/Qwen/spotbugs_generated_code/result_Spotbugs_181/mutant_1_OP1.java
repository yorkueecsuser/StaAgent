class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
        int qzjfnxrm = 42; // Dead Store: Unused variable declaration
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }
}