class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] array) {
        // Directly storing the reference to the external array
        this.internalArray = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        
        // Unreachable if-else statement added
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("Initialization complete.");
        }
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

        // Unreachable if-else statement added
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("Show bug method executed.");
        }
    }
    
    private boolean alwaysFalse() {
        return false; // This method is used to avoid compile-time constants in the condition.
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayBufferExposure example = new ArrayBufferExposure(myArray);
        example.showBug(myArray);
    }
}