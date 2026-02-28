import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This code is unreachable, but it's included due to the mutation operator
            buffer = ByteBuffer.allocate(0);
        }

        return buffer;
    }
}