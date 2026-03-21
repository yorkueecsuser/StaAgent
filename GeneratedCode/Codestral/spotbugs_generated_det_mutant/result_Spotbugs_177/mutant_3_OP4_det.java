import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        if (false && true && true && false && false && false && true && false && false && true && false) {boolean nrljymbj = true;}else{byte uqtjachs = -32;}
        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return buffer;
    
}
}