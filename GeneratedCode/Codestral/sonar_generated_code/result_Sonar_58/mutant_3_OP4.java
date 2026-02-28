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
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable or method call
        if (unreachableCondition) {
            // Unreachable code block
            System.out.println("This code block should be unreachable.");
        }
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }

    private boolean getUnreachableCondition() {
        // Implement a condition that will always be false
        return pos < 0;
    }
}