class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        
        // Introduced loop that does not affect functionality
        int[] tempArray = new int[5];
        int i = 0;
        while (i < tempArray.length) {
            tempArray[i] = i;
            i++;
        }

        // Applying Equivalent Loop Replacement mutation operator
        do {
            tempArray[i - 1] = i - 1;
            i--;
        } while (i > 0);

        return staticArray;
    }
}