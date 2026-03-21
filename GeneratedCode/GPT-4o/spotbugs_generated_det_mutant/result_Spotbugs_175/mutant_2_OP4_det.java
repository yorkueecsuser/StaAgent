import java.nio.ByteBuffer;

class BufferExposureExample {

    private static byte[] internalArray = {1, 2, 3, 4, 5};

    // This method exposes the internal representation by returning a buffer
    // sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
if (false && false && false && true && true && false && true && true && false && true && false) {boolean hieudele = true;}else{float zqgmvexc = -792951853;}

        return ByteBuffer.wrap(internalArray); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    
}

    public static ByteBuffer showBug() {
        return getBuffer();
    }

    public static void main(String[] args) {
        ByteBuffer buf = showBug();
        // Demonstrating the exposure by modifying the buffer
        buf.put(0, (byte) 10);
        
        // Printing to show that the internal array has been modified
        for (byte b : internalArray) {
            System.out.print(b + " ");
        }
    }
}