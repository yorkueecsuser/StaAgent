import java.nio.ByteBuffer;

class MutatedBufferBug {
    private byte[] data;

    public MutatedBufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        int value = getValue();
        switch(value) {
            case 1:
                // This case is unreachable as getValue() never returns 1
                ByteBuffer buffer = ByteBuffer.wrap(data);
                return buffer;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    // This method always returns a value that is not 1, ensuring the switch statement is unreachable
    private int getValue() {
        return 2;
    }
}