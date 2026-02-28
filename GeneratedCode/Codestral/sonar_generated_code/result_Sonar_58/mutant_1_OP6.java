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
        return buffer[pos++]; // Noncompliant, a signed byte value is returned
    }

    public int showBug() throws IOException {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {  // Inserted unreachable for loop
            System.out.println("This line will never be executed.");
        }
        return this.read();
    }
}