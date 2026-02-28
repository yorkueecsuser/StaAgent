import java.nio.IntBuffer;

class BufferExposureExample {
    private int[] data;

    public BufferExposureExample(int[] initialData) {
        this.data = initialData;
    }

    public IntBuffer getBuffer() {
        return IntBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
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