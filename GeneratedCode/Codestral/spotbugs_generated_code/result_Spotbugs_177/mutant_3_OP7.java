import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        // Mutated code: Unreachable while loop
        boolean unusedCondition = false;
        while (unusedCondition) {
            // This block of code is unreachable as the condition is always false
            System.out.println("This line should never be executed.");
        }

        return buffer;
    }
}