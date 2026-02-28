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
    private int[] x; // Renamed 'data' to 'x'
    public BufferExposureExample(int[] y) { // Renamed 'initialData' to 'y'
        this.x = y;
    }

    public IntBuffer z() { // Renamed 'getBuffer' to 'z'
        return IntBuffer.wrap(x); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
    }

    public void a(int[] b) { // Renamed'showBug' to 'a', 'newData' to 'b'
        this.x = b;
        IntBuffer c = z(); // Renamed 'buffer' to 'c'
        System.out.println("Buffer contents before modification:");
        while (c.hasRemaining()) {
            System.out.print(c.get() + " ");
        }
        System.out.println();

        // Modify the original data array
        x[0] = 999;

        c.rewind(); // Reset buffer position to start
        System.out.println("Buffer contents after modification:");
        while (c.hasRemaining()) {
            System.out.print(c.get() + " ");
        }
        System.out.println();
    }

    public static void d(String[] e) { // Renamed'main' to 'd', 'args' to 'e'
        BufferExposureExample f = new BufferExposureExample(new int[]{1, 2, 3, 4, 5}); // Renamed 'example' to 'f'
        f.a(new int[]{10, 20, 30, 40, 50}); // Renamed'showBug' to 'a'
    }
}