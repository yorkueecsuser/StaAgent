import java.nio.ByteBuffer;
import java.util.Random;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Bug: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        return buffer;
    }

    public static void showBug() {
        ByteBuffer buf = getBuffer();
        buf.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);

        // Mutation: Dead Store
        Random random = new Random();
        int deadStoreVariable = random.nextInt(); // This variable is never used
    }

    public static void main(String[] args) {
        showBug();
    }
}