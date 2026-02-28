class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            staticArray = new int[externalArray.length];
            System.arraycopy(externalArray, 0, staticArray, 0, externalArray.length);
        }
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if block is unreachable
        return false;
    }
}