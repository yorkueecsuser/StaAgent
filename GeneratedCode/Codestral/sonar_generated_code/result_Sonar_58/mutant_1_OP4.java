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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable due to the condition being always false
            return buffer[pos++]; // Noncompliant, a signed byte value is returned
        } else {
            // Added mutation: an unreachable else branch
            throw new RuntimeException("Unreachable code executed");
        }
    }

    public int showBug() throws IOException {
        return this.read();
    }

    private boolean getCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }
}