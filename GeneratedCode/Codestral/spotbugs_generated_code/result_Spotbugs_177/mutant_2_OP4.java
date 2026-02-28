import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        if (getUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This is the original code
            return buffer;
        }

        // Adding this line to ensure the function returns a value in all paths
        throw new IllegalStateException("This line should never be executed.");
    }
}