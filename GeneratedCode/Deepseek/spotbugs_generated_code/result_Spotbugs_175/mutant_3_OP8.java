import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedData = new byte[10];
    private static ByteBuffer buf = ByteBuffer.wrap(sharedData);

    public static ByteBuffer getBuffer() {
        return buf;
    }

    public static void showBug() {
        ByteBuffer buffer = getBuffer();
        buffer.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of sharedData: " + sharedData[0]);
    }

    public static void main(String[] args) {
        showBug();
    }
}