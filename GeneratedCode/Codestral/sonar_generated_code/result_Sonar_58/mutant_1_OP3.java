import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    private boolean getFalseCondition() {
        return false;
    } // Method to ensure dynamically determined false condition

    @Override
    public int read() throws IOException {
        if (getFalseCondition()) { // Inserted unreachable if statement
            throw new IllegalStateException("This line should be unreachable");
        }
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }
}