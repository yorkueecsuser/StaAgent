import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buffer = ByteBuffer.wrap(sharedBuffer);

    // Original bug-prone code
    public static ByteBuffer getBuffer() {
        return buffer;
    }

    public static void showBug() {
        ByteBuffer buf = getBuffer();
        buf.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);
    }

    public static void main(String[] args) {
        showBug();
        // Mutated code - Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
    }
}