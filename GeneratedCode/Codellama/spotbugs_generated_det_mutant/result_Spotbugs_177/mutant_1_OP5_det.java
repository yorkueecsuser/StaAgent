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
        int ihsdopgj = 0;switch  (ihsdopgj) {case 1:double wbwfigng = -959774029;break;default:int uoxsgkob = -500651363;break;}
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}