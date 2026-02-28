class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        
        // Introduced loop that does not affect functionality
        int i = 0;
        while (i < inputArray.length) {
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            j++;
        } while (j < inputArray.length);

        return staticArray;
    }
}