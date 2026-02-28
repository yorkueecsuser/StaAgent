import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { 
    private byte[] buffer;
    private int pos;
    private boolean shouldRun;

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
        this.shouldRun = false;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF;
    }

    public int showBug() throws IOException {
        if (shouldRun) {
            return this.read();
        } else {
            return -1;
        }
    }
}