import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer b = ByteBuffer.wrap(data); // Mutant: Renaming 'buffer' to 'b'
        return b;
    }
}