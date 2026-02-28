import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        boolean condition = false; // Unreachable condition for mutation operator
        if (condition) {
            for (int i = 0; i < 10; i++) {
                // Unreachable for loop
            }
        }

        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return buffer;
    }
}