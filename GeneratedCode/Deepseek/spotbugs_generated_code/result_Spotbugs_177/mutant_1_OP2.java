import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        ByteBuffer bufferDuplicate = buffer; // Mutant: Duplication of the assignment statement
        return buffer;
    }
}