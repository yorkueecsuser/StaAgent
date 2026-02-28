import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Bug: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public static ByteBuffer getBuffer() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable.");
            return ByteBuffer.allocate(0);
        } else {
            // This branch is reachable
            return buffer;
        }
    }

    private static boolean getUnreachableCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
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