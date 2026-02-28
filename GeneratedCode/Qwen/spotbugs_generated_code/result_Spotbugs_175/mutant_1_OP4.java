import java.nio.ByteBuffer;

class BufferExposureExample {
    private static final byte[] internalData = {1, 2, 3, 4, 5};

    public static ByteBuffer getBuffer() {
        boolean shouldRun = getCondition(); // Dynamically determined condition to avoid unreachable code
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable if shouldRun is false
            System.out.println("This is an unreachable block.");
        }
        return ByteBuffer.wrap(internalData); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
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

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This ensures the else block is unreachable, but the condition is not a compile-time constant
    }
}