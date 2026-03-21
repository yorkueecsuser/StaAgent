import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Bug: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        return buffer;
    }

    // Mutant: Duplication of the assignment statement
    public static ByteBuffer duplicateBuffer() {
        ByteBuffer duplicateBuffer = buffer;  // Duplicating the assignment statement
        return duplicateBuffer;
    }

    public static void showBug() {
        ByteBuffer buf = getBuffer();
        buf.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);

        ByteBuffer dupBuf = duplicateBuffer();
        dupBuf.put(0, (byte) 43);  // Modifying the duplicated buffer also affects the original buffer
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);
    }

    public static void main(String[] args) {
        showBug();
    }
}