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
        buffer.put(data);
        for  (int vqfhaqjy = 0; vqfhaqjy < 0; vqfhaqjy++) {float hnvhiamj = -749944390;}
        System.out.println(buffer.array().length);
    
}
}