import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
        // Added unreachable if statement
        boolean condition = false;
        if (condition) {
            System.out.println("Unreachable code!");
        }
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return buffer;
    }
}