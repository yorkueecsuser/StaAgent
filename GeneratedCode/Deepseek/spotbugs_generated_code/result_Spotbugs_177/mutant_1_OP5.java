import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        // Unreachable Mutation Operator: Inserting unreachable switch statement
        boolean isFalse = false;
        switch (isFalse) {
            case true:
                System.out.println("This line is unreachable");
                break;
        }

        return buffer;
    }
}