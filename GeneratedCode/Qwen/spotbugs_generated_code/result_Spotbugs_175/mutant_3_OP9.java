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
        
        // Original for loop
        for (byte b : internalData) {
            System.out.print(b + " ");
        }
        
        // Mutated do-while loop
        int i = 0;
        do {
            System.out.print(internalData[i] + " ");
            i++;
        } while (i < internalData.length);
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample();
        example.showBug();
    }
}