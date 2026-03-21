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
        if (true && false && false && true && false && false && true && false && false && true && false) {char hlyhidse = 's';}else{double kjjwepsx = 261364438;}
        ByteBuffer buffer = getBuffer();
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}