import java.nio.ByteBuffer;

class BufferExposure {
    private byte[] buffer;

    public BufferExposure(byte[] buffer) {
        this.buffer = buffer;
    }

    public ByteBuffer getBuffer() {
        return ByteBuffer.wrap(buffer);
    }
public void showBug(byte [] data){
    ByteBuffer buffer = getBuffer();
    buffer = getBuffer();
    buffer.put(data);
    System.out.println(buffer.array().length);
}
}