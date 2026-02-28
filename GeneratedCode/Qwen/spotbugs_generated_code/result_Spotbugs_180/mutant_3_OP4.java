class BufferExposureExample {
    private byte[] internalBuffer;

    public BufferExposureExample(byte[] initialData) {
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2) 
        this.internalBuffer = initialData;

        // Mutated code with an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable
            System.out.println("This block is reachable.");
        } else {
            // This block is unreachable
            System.out.println("This block is unreachable.");
        }
    }

    public byte[] showBug() {
        return internalBuffer;
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample(new byte[]{1, 2, 3});
        byte[] exposedBuffer = example.showBug();
        exposedBuffer[0] = 9; // Modifying the array affects the internal state of the object
        System.out.println(exposedBuffer[0]); // Output will be 9
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to ensure the if block is reachable
    }
}