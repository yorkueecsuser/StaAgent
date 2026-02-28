import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        boolean shouldNotRun = false; // Condition is always false to make the branch unreachable
        if (pos == buffer.length) {
            return -1;
        }
        if (shouldNotRun) {
            // Unreachable branch
            throw new IllegalStateException("Unreachable code executed");
        } else {
            return buffer[pos++];
        }
    }

    public int showBug() throws IOException {
        return this.read();
    }
}