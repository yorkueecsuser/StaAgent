import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { 
    private byte[] buffer;
    private int pos;

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        int temp = buffer[pos++] & 0xFF; // The 0xFF bitmask is applied
        int duplicate = temp & 0xFF; // Duplicated statement, which is not using method invocation
        return temp;
    }

    public int showBug() throws IOException {
        return this.read();
    }
}