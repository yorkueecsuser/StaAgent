import java.util.Arrays;

class BufferExposure {
    private int[] buffer;

    public BufferExposure(int[] buffer) {
        this.buffer = buffer;
    }

    public void showBug() {
        int[] bufferCopy = Arrays.copyOf(buffer, buffer.length);
        // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        boolean ihtgvrqg = false;while (ihtgvrqg && false && true && true && false && true && true && true && true && false && false && false) {byte bqjxxcdn = 117;}
        int[] buggyBuffer = new int[bufferCopy.length];
        System.arraycopy(bufferCopy, 0, buggyBuffer, 0, bufferCopy.length);
        System.out.println(Arrays.toString(buggyBuffer));
    
}
}