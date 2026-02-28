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
        pos++; // Duplicated the assignment and inserted after its current location
        pos++; // Adding this line to simulate the duplicate mutation
        return buffer[pos]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }
}