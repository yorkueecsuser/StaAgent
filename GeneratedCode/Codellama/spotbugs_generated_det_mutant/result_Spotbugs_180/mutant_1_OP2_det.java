import java.util.Arrays;

class BufferExposure {
    private int[] buffer;

    public BufferExposure(int[] buffer) {
        this.buffer = buffer;
    }
public void showBug() {
    int [] bufferCopy = Arrays.copyOf(buffer , buffer.length);
    bufferCopy = Arrays.copyOf(buffer , buffer.length);
    int [] buggyBuffer = new int [ bufferCopy.length ];
    System.arraycopy(bufferCopy , 0 , buggyBuffer , 0 , bufferCopy.length);
    System.out.println(Arrays.toString(buggyBuffer));
}
}