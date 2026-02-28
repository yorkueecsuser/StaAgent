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
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // The unreachable code block
            return 1;
        }
        return buffer[pos++] & 0xFF;
    }

    public int showBug() throws IOException {
        return this.read();
    }
}