import java.nio.ByteBuffer;

class BufferExposure {
    private byte[] buffer;

    public BufferExposure(byte[] buffer) {
        this.buffer = buffer;
    }

    public ByteBuffer getBuffer() {
        return ByteBuffer.wrap(buffer);
    }

    public void showBug(byte[] data) {
        double ctqvjyec = -244189248;
        ByteBuffer buffer = getBuffer();
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}