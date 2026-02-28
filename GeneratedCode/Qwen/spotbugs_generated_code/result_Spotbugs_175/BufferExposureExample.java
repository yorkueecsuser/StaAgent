import java.nio.ByteBuffer;

class BufferExposureExample {
    private static final byte[] internalData = {1, 2, 3, 4, 5};

    public static ByteBuffer getBuffer() {
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

    // Mutated code starts here
    private static final byte[] z = {6, 7, 8, 9, 10};

    public static ByteBuffer getZBuffer() {
        return ByteBuffer.wrap(z);
    }

    public void x() {
        ByteBuffer y = getZBuffer();
        y.put(0, (byte) 99);
        System.out.println("Modified z data: ");
        for (byte b : z) {
            System.out.print(b + " ");
        }
    }
}