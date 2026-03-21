import java.util.Arrays;

class BufferExposure {
    private int[] buffer;

    public BufferExposure(int[] buffer) {
        this.buffer = buffer;
    }

    public void showBug() {
        int[] gvsbycuz = Arrays.copyOf(buffer, buffer.length);
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        int[] cfcqhmuo = new int[gvsbycuz.length];
        System.arraycopy(gvsbycuz, 0, cfcqhmuo, 0, gvsbycuz.length);
        System.out.println(Arrays.toString(cfcqhmuo));
    }
}