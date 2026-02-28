import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    public static ByteBuffer getBuffer() {
        boolean shouldNotExecute = getCondition();
        // Mutated Code: Unreachable if statement
        if (shouldNotExecute) {
            System.out.println("This code should never execute!");
        }
        return buffer;
    }

    private static boolean getCondition() {
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