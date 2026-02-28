import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        return buffer;
    }

    public ByteBuffer exposeInternalRepresentation() {
        ByteBuffer b = ByteBuffer.wrap(data);
        return b;
    }
}