class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] array) {
        // Directly storing the reference to the external array
        this.internalArray = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public int[] getInternalArray() {
        // Directly returning the reference to the internal array
        return internalArray; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public void showBug(int[] externalArray) {
        ArrayBufferExposure bufferExposure = new ArrayBufferExposure(externalArray);
        int[] exposedArray = bufferExposure.getInternalArray();

        // Modifying the external array
        externalArray[0] = 42;

        // Demonstrating that the internal array has also changed
        System.out.println("Exposed Array First Element: " + exposedArray[0]);

        // Unreachable switch statement added as a mutation
        int unreachableValue = getRuntimeCondition();
        switch (unreachableValue) {
            case 999: // This case will never be hit because unreachableValue is not 999
                System.out.println("This is unreachable code due to mutation.");
                break;
            default:
                break;
        }
    }

    // Method to simulate a runtime condition; always returns a value that does not match the case above
    private int getRuntimeCondition() {
        return 0; // Always returns 0, making the case 999 unreachable
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayBufferExposure example = new ArrayBufferExposure(myArray);
        example.showBug(myArray);
    }
}