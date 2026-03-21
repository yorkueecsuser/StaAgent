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
        if (false && true && true && true && true && false && true && true && true && true && false) {byte sfwdgbeb = 95;}else{double tcmrcmnx = -812851848;}
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}