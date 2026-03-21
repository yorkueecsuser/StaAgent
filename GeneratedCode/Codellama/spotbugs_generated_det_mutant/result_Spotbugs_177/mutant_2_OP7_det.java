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
        boolean zfpphmfm = false;while (zfpphmfm && false && true && false && true && true && false && true && true && true && true && false) {char ynuuhzuv = 'j';}
        ByteBuffer buffer = getBuffer();
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}