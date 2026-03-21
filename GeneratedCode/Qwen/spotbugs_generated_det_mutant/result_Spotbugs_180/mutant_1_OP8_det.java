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
        byte[] lehkftmv = example.showBug();
        lehkftmv[0] = 9; // Modifying the array affects the internal state of the object
        System.out.println(lehkftmv[0]); // Output will be 9
    }
}