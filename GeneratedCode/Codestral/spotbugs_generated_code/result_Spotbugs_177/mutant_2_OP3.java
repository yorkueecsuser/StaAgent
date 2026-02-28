import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        if (getUnreachableCondition()) {
            System.out.println("This code will never execute");
        }
        return buffer;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}