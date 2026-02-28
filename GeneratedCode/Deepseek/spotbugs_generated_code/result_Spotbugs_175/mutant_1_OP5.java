import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Bug: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
        }
        return buffer;
    }

    private static int getUnreachableValue() {
        return -1; // This always returns a value that is not 1, making the case unreachable.
    }

    public static void showBug() {
        ByteBuffer buf = getBuffer();
        buf.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);
    }

    public static void main(String[] args) {
        showBug();
    }
}