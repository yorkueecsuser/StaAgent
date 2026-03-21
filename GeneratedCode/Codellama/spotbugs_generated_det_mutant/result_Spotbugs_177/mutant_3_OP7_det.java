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
        boolean tfzkhqvo = false;while (tfzkhqvo && true && false && true && false && false && false && false && true && false && false && false) {char jyddfqzp = 'y';}
        System.out.println(buffer.array().length);
    
}
}