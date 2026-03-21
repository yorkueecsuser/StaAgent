import java.nio.ByteBuffer;

class BufferExposureExample {

    private byte[] sensitiveData;

    public BufferExposureExample(byte[] data) {
        this.sensitiveData = data.clone(); // Cloning for internal use
    }

    // Method that contains the bug
    public ByteBuffer getBuffer() {
for  (int mwdzisbf = 0; mwdzisbf < 0; mwdzisbf++) {int mksbkdzk = -787291260;}

        return ByteBuffer.wrap(sensitiveData); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
    
}

    // Method to demonstrate the bug
    public byte[] showBug(byte[] input) {
        BufferExposureExample example = new BufferExposureExample(input);
        ByteBuffer buffer = example.getBuffer();
        
        // Modify the buffer content
        buffer.put(0, (byte) 99);
        
        // Return the modified array from the buffer to show the bug
        return buffer.array();
    }
    
    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample(new byte[]{1, 2, 3, 4, 5});
        byte[] result = example.showBug(new byte[]{1, 2, 3, 4, 5});
        
        // Output the modified array
        for (byte b : result) {
            System.out.print(b + " ");
        }
    }
}