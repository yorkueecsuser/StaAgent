import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.allocate(data.length);
        int i = 0;
        do { // Mutation: Equivalent Loop Replacement
            buffer.put(data[i]);
            i++;
        } while (i < data.length);
        buffer.flip();
        return buffer;
    }
}