import java.util.Arrays;

class BufferExposure {
    private int[] buffer;

    public BufferExposure(int[] buffer) {
        this.buffer = buffer;
    }

    public void showBug() {
        int[] lgtdwlkh = Arrays.copyOf(buffer, buffer.length);
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        int[] nqvvrykp = new int[lgtdwlkh.length];
        System.arraycopy(lgtdwlkh, 0, nqvvrykp, 0, lgtdwlkh.length);
        System.out.println(Arrays.toString(nqvvrykp));
    }
}