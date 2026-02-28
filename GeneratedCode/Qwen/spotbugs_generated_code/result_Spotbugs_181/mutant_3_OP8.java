class StaticBufferExposure {

    private static int[] staticArray;

    public void setStaticArray(int[] externalArray) {
        staticArray = externalArray; // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  
    }

    public int[] showBug(int[] inputArray) {
        setStaticArray(inputArray);
        return staticArray;
    }

    // Mutated code with renaming mutation operator
    private int[] anotherArray;

    public void updateArray(int[] newArray) {
        anotherArray = newArray;
    }

    public int[] displayArray(int[] testArray) {
        updateArray(testArray);
        return anotherArray;
    }
}