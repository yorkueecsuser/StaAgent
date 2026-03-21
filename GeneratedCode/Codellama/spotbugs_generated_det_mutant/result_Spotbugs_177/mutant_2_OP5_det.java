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
        int mpuxkbpr = 0;switch  (mpuxkbpr) {case 1:int zusxumza = 193095461;break;default:String csfpecxe = "kymdoqjr";break;}
        ByteBuffer buffer = getBuffer();
        buffer.put(data);
        System.out.println(buffer.array().length);
    
}
}