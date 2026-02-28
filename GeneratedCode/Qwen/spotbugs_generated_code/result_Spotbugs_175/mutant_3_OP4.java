import java.nio.ByteBuffer;

class BufferExposureExample {
    private static final byte[] internalData = {1, 2, 3, 4, 5};

    public static ByteBuffer getBuffer() {
        boolean shouldRun = getCondition(); // Ensure the condition is dynamically determined
        if (shouldRun) {
            // This block is reachable
            System.out.println("This block is reachable");
        } else {
            // This block is unreachable due to the condition always being true
            System.out.println("This block is unreachable");
        }
        return ByteBuffer.wrap(internalData); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
    }

    private static boolean getCondition() {
        // Always return true to make the else block unreachable
        return true;
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