import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        int value = buffer[pos++]; // Noncompliant, a signed byte value is returned
        value = buffer[pos - 1]; // New line: Duplicate the assignment
        return value;
    }

    public int showBug() throws IOException {
        return this.read();
    }
}