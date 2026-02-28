import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            // This loop is unreachable as the condition is always false
            System.out.println("This is an unreachable loop");
        }
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        return this.read();
    }

    private boolean getCondition() {
        // This method always returns false, making the loop unreachable
        return false;
    }
}