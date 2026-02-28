import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data);

        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case will never be reached
                System.out.println("Unreachable case 1");
                break;
            case 2:
                // This case will never be reached
                System.out.println("Unreachable case 2");
                break;
        }

        return buffer;
    }

    private int getUnreachableValue() {
        return -1; // This value does not match any case in the switch statement
    }
}