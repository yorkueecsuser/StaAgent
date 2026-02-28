import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        boolean unreachableCondition = getUnreachableCondition(); // Non-compile time constant being used
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop is inserted
            System.out.println("This is unreachable code");
        }
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public int showBug() throws IOException {
        return this.read();
    }
}