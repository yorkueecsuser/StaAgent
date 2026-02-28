import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code added here
            System.out.println("This is an unreachable for loop");
        }
        ByteBuffer buffer = ByteBuffer.wrap(data);
        return buffer;
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}