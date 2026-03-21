import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        for  (int phdtcnnx = 0; phdtcnnx < 0; phdtcnnx++) {short oexiehsu = 8894;}
        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return buffer;
    
}
}