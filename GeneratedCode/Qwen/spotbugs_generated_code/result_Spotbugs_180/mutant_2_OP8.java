class BufferExposureExample {
    private byte[] internalBuffer;

    public BufferExposureExample(byte[] initialData) {
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2) 
        this.internalBuffer = initialData;
    }

    public byte[] showBug() {
        return internalBuffer;
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample(new byte[]{1, 2, 3});
        byte[] exposedBuffer = example.showBug();
        exposedBuffer[0] = 9; // Modifying the array affects the internal state of the object
        System.out.println(exposedBuffer[0]); // Output will be 9

        // Mutated code with renaming
        byte[] z = new byte[]{4, 5, 6};
        BufferExposureExample y = new BufferExposureExample(z);
        byte[] x = y.showBug();
        x[1] = 8;
        System.out.println(x[1]);
    }
}