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
        int gjfygmzv = 0;switch  (gjfygmzv) {case 1:double ycxgsfwd = -236079925;break;default:int vsarzvdk = 167264401;break;}
        System.out.println(buffer.array().length);
    
}
}