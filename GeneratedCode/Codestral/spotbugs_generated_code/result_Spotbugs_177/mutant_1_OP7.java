import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        // Mutated code: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code is unreachable, as the condition is always false
            System.out.println("This is an unreachable statement.");
        }

        return buffer;
    }
}