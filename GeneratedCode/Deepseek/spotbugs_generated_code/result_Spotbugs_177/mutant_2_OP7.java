import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false to make the loop unreachable
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data); // BUG: Exposes internal representation by returning a buffer sharing non-public data

        boolean condition = getUnreachableCondition();
        while (condition) {
            // This loop is unreachable because the condition is always false
            // However, it is added to the code as per the Mutation Operator requirements
        }

        return buffer;
    }
}