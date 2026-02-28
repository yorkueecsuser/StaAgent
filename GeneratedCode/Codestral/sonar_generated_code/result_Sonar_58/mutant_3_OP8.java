import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0; // old variable name
    private int z = pos; // new variable name

    @Override
    public int read() throws IOException {
        if (z == buffer.length) {
            return -1;
        }
        return buffer[z++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }
}