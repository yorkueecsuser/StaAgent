import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int idx = 0; // Renamed variable 'pos' to 'idx'

    @Override
    public int read() throws IOException {
        if (idx == buffer.length) {
            return -1;
        }
        return buffer[idx++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }
}