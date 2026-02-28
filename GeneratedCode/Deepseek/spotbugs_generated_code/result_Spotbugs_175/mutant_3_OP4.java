import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    public static ByteBuffer getBuffer() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            int x = 10 / 0; // This will cause a division by zero error
        } else {
            // Original code
            return buffer;
        }
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