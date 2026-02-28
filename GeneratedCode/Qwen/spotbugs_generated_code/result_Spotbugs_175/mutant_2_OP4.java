import java.nio.ByteBuffer;

class BufferExposureExample {
    private static final byte[] internalData = {1, 2, 3, 4, 5};

    public static ByteBuffer getBuffer() {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because shouldRun is always true
            System.out.println("This is an unreachable block.");
        }
        return ByteBuffer.wrap(internalData); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
    }

    private static boolean getCondition() {
        // Always returns true to ensure the if block is reachable and else block is unreachable
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