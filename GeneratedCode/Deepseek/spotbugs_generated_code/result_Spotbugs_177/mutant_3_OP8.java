import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] a) {
        this.data = a;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        return buffer;
    }

    public ByteBuffer showMutantBug() {
        ByteBuffer b = ByteBuffer.wrap(data);  // Mutant: Renaming 'buffer' to 'b'
        return b;
    }
}