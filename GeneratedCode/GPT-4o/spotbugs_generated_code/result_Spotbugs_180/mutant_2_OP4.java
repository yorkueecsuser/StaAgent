class ArrayBufferExposure {

    private int[] internalArray;

    public ArrayBufferExposure(int[] array) {
        // Directly storing the reference to the external array
        this.internalArray = array; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // Inserting an unreachable if-else statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            // This block is unreachable because the condition is always false
            System.out.println("Unreachable code block");
        } else {
            // Regular execution continues here
            System.out.println("Regular constructor execution");
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
    }
    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        ArrayBufferExposure example = new ArrayBufferExposure(myArray);
        example.showBug(myArray);
    }

    // Method to get a false condition for unreachable code
    private boolean getFalseCondition() {
        return false;
    }
}