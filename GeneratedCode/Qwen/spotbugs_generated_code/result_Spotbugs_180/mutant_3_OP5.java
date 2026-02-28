class BufferExposureExample {
    private byte[] internalBuffer;

    public BufferExposureExample(byte[] initialData) {
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2) 
        this.internalBuffer = initialData;

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() does not return true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // This is the default case
                break;
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

    // Method to provide a dynamic condition that never evaluates to true
    private boolean getCondition() {
        return false;
    }
}