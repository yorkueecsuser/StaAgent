import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        ByteBuffer duplicateBuffer = buffer; // Mutation: Duplicate assignment statement
        return buffer;
    }
}