import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        int iiwkbcvw = 0;switch  (iiwkbcvw) {case 1:double uxavyqje = -838132067;break;default:byte ftdqkrge = -23;break;}
        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return buffer;
    
}
}