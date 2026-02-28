class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] array) {
        // Directly storing the reference to the external array
        this.internalArray = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
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

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed in showBug.");
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayBufferExposure example = new ArrayBufferExposure(myArray);
        example.showBug(myArray);

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed in main.");
        }
    }

    // Method to ensure the condition is dynamically determined at runtime
    private static boolean getCondition() {
        return false;
    }
}