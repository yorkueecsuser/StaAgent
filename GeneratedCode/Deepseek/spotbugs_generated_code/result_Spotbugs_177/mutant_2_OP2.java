import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data); // Original statement
        ByteBuffer bufferCopy = buffer.duplicate(); // Mutated statement: Duplicating the buffer
        return bufferCopy; // Returning the duplicate of the original buffer
    }
}