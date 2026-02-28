import java.nio.IntBuffer;

class BufferExposureExample {
    private int[] data;

    public BufferExposureExample(int[] initialData) {
        this.data = initialData;
    }

    public IntBuffer getBuffer() {
        return IntBuffer.wrap(data); // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop is unreachable");
        }
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

    // Method to provide a dynamic condition for the unreachable loop
    private boolean getCondition() {
        return false; // This ensures the condition is always false, making the loop unreachable
    }
}