import java.nio.ByteBuffer;

class BufferBug {
    private static byte[] sharedBuf = new byte[10]; // Renamed'sharedBuffer' to'sharedBuf'
    private static ByteBuffer buf = ByteBuffer.wrap(sharedBuf); // Renamed 'buffer' to 'buf'

    public static ByteBuffer getBuffer() {
        return buf; // Returning the renamed buffer
    }

    public static void showBug() {
        ByteBuffer bufTemp = getBuffer(); // Renamed 'buf' to 'bufTemp'
        bufTemp.put(0, (byte) 42);  // External code can modify internal state
        System.out.println("First byte of shared buffer: " + sharedBuf[0]);
    }

    public static void main(String[] args) {
        showBug();
    }
}