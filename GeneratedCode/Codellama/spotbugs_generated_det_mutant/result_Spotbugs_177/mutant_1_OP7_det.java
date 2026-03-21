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
        boolean otrnujkl = false;while (otrnujkl && true && false && false && true && false && false && true && true && false && true && false) {int xeofvocb = 415604533;}
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}