import java.nio.ByteBuffer;

class BufferExposureExample {

    private static byte[] internalArray = {1, 2, 3, 4, 5};

    // This method exposes the internal representation by returning a buffer
    // sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        return ByteBuffer.wrap(internalArray); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    }

    public static ByteBuffer showBug() {
        return getBuffer();
    }
public static void main(String [] args){
    ByteBuffer buf = showBug();
    buf = showBug();
    buf.put(0 ,(byte)10);
    for(byte b : internalArray){ System.out.print(b + " "); }
}
}