import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream {
    private byte[] buffer;
    private int pos;
    private boolean conditionWhile = false; // The non-final variable used in the while loop condition

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF;
    }

    public int showBug() throws IOException {
        while (conditionWhile) { // Unreachable while loop
            ; // Empty statement to avoid unreachable statement error
        }
        return this.read();
    }
}