import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        // Mutation: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never print.");
        } else {
            // This else block is unreachable as the condition is always false
            buffer = null;
        }
        return buffer;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}