import java.util.Arrays;

class BufferExposure {
    private int[] buffer;

    public BufferExposure(int[] buffer) {
        this.buffer = buffer;
    }

    public void showBug() {
        int[] maixxbzb = Arrays.copyOf(buffer, buffer.length);
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        int[] lteufkgu = new int[maixxbzb.length];
        System.arraycopy(maixxbzb, 0, lteufkgu, 0, maixxbzb.length);
        System.out.println(Arrays.toString(lteufkgu));
    }
}