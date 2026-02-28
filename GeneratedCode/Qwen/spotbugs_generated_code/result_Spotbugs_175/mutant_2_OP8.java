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

    // Mutated code with renaming operator
    private static final byte[] z = {1, 2, 3, 4, 5};

    public static ByteBuffer x() {
        return ByteBuffer.wrap(z); // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
    }

    public void y() {
        ByteBuffer v = x();
        v.put(0, (byte) 99);
        System.out.println("Modified internal data: ");
        for (byte w : z) {
            System.out.print(w + " ");
        }
    }

    public static void q(String[] p) {
        BufferExposureExample o = new BufferExposureExample();
        o.y();
    }
}