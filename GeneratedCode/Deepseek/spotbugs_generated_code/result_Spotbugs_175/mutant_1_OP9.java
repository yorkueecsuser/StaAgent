import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Bug: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        return buffer;
    }

    // Mutated code: Equivalent Loop Replacement
    public static void loopExample() {
        int i = 0;
        do {
            System.out.println("This is a mutated loop that does not affect the original bug.");
            i++;
        } while (i < 5);
    }

    public static void showBug() {
        ByteBuffer buf = getBuffer();
        buf.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);
    }

    public static void main(String[] args) {
        showBug();
        loopExample(); // Call the mutated loop
    }
}