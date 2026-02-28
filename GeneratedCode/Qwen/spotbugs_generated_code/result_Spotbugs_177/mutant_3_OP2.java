import java.nio.IntBuffer;

class BufferExposureExample {
    private int[] data;

    public BufferExposureExample(int[] initialData) {
        this.data = initialData;
        this.data = initialData; // Mutation: Duplicate assignment statement
    }

    public IntBuffer getBuffer() {
        return IntBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        return IntBuffer.wrap(data); // Mutation: Duplicate return statement
    }

    public void showBug(int[] newData) {
        this.data = newData;
        this.data = newData; // Mutation: Duplicate assignment statement
        IntBuffer buffer = getBuffer();
        System.out.println("Buffer contents before modification:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Modify the original data array
        data[0] = 999;
        data[0] = 999; // Mutation: Duplicate assignment statement

        buffer.rewind(); // Reset buffer position to start
        buffer.rewind(); // Mutation: Duplicate method call
        System.out.println("Buffer contents after modification:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample(new int[]{1, 2, 3, 4, 5});
        example.showBug(new int[]{10, 20, 30, 40, 50});
        example.showBug(new int[]{10, 20, 30, 40, 50}); // Mutation: Duplicate method call
    }
}