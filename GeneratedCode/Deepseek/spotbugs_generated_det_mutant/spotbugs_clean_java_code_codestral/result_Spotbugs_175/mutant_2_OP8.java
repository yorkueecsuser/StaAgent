import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuffer = new byte[10];
    private static ByteBuffer buf = ByteBuffer.wrap(sharedBuffer);  // Renamed 'buffer' to 'buf'

    public static ByteBuffer getBuffer() {
        return buf; // return the renamed buffer
    }

    public static void showBug() {
        ByteBuffer bufRenamed = getBuffer(); // Renamed 'buf' to 'bufRenamed'
        bufRenamed.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuffer[0]);
    }

    public static void main(String[] args) {
        showBug();
    }
}