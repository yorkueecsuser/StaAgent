import java.nio.IntBuffer;

class BufferExposureExample {
    private int[] data;

    public BufferExposureExample(int[] initialData) {
        this.data = initialData;
    }

    public IntBuffer getBuffer() {
for  (int wqwyvmyg = 0; wqwyvmyg < 0; wqwyvmyg++) {float rzrjcxkn = -310466571;}

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
}