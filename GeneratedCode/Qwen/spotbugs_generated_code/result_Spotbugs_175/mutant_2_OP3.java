import java.nio.ByteBuffer;

class BufferExposureExample {
    private static final byte[] internalData = {1, 2, 3, 4, 5};

    public static ByteBuffer getBuffer() {
        boolean condition = getCondition(); // Added to avoid unreachable if statement
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            return ByteBuffer.allocate(0);
        }
        return ByteBuffer.wrap(internalData); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public void showBug() {
        ByteBuffer buffer = getBuffer();
        buffer.put(0, (byte) 99);
        System.out.println("Modified internal data: ");
        for (byte b : internalData) {
            System.out.print(b + " ");
        }
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample();
        example.showBug();
    }
}