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

    // Mutated code
    private int[] z;

    public BufferExposureExample(int[] x) {
        this.z = x;
    }

    public IntBuffer y() {
        return IntBuffer.wrap(z);
    }

    public void a(int[] b) {
        this.z = b;
        IntBuffer c = y();
        System.out.println("Buffer contents before modification:");
        while (c.hasRemaining()) {
            System.out.print(c.get() + " ");
        }
        System.out.println();

        // Modify the original data array
        z[0] = 999;

        c.rewind(); // Reset buffer position to start
        System.out.println("Buffer contents after modification:");
        while (c.hasRemaining()) {
            System.out.print(c.get() + " ");
        }
        System.out.println();
    }

    public static void d(String[] e) {
        BufferExposureExample f = new BufferExposureExample(new int[]{1, 2, 3, 4, 5});
        f.a(new int[]{10, 20, 30, 40, 50});
    }
}