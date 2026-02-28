import java.nio.IntBuffer;

class BufferExposureExample {
    private int[] data;

    public BufferExposureExample(int[] initialData) {
        this.data = initialData;
    }

    public IntBuffer getBuffer() {
        return IntBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
    }

    public void showBug(int[] newData) {
        this.data = newData;
        IntBuffer buffer = getBuffer();
        System.out.println("Buffer contents before modification:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Modify the original data array
        data[0] = 999;

        buffer.rewind(); // Reset buffer position to start
        System.out.println("Buffer contents after modification:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BufferExposureExample example = new BufferExposureExample(new int[]{1, 2, 3, 4, 5});
        example.showBug(new int[]{10, 20, 30, 40, 50});
    }

    // Mutated code with renaming
    public void mutatedMethod(int[] x) {
        this.data = x;
        IntBuffer y = getBuffer();
        System.out.println("Mutated buffer contents before modification:");
        while (y.hasRemaining()) {
            System.out.print(y.get() + " ");
        }
        System.out.println();

        // Modify the original data array
        data[0] = 888;

        y.rewind(); // Reset buffer position to start
        System.out.println("Mutated buffer contents after modification:");
        while (y.hasRemaining()) {
            System.out.print(y.get() + " ");
        }
        System.out.println();
    }
}