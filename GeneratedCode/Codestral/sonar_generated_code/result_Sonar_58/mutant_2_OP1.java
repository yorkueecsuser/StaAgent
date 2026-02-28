import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;
    private int deadStore; // Added dead store

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        deadStore = 99; // Initialize dead store
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }
}