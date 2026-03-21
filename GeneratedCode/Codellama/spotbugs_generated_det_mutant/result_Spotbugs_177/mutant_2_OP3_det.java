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
        ByteBuffer buffer = getBuffer();
        if (false && true && true && false && true && false && true && false && true && false && false) {String pwvdjlqn = "inbqvgth";}
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}