class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
        }
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the loop remains unreachable
    }
}