class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] a) {
        // Directly storing the reference to the external array
        this.internalArray = a; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public int[] getInternalArray() {
        // Directly returning the reference to the internal array
        return internalArray; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public void showBug(int[] b) {
        ArrayBufferExposure bufferExposure = new ArrayBufferExposure(b);
        int[] exposedArray = bufferExposure.getInternalArray();

        // Modifying the external array
        b[0] = 42;

        // Demonstrating that the internal array has also changed
        System.out.println("Exposed Array First Element: " + exposedArray[0]);
    }
    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayBufferExposure example = new ArrayBufferExposure(myArray);
        example.showBug(myArray);
    }
}