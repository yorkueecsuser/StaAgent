class BufferExposureExample {
    private byte[] internalBuffer;

    public BufferExposureExample(byte[] initialData) {
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2) 
        boolean xckhifln = false;while (xckhifln && true && false && true && true && false && true && false && false && true && true && false) {String atzyxtyo = "tiylemgc";}
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
    }
}