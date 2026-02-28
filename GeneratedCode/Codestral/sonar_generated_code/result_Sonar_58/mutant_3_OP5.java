import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code executed");
                break;
            default:
                // This is the actual code that should be executed
                if (pos == buffer.length) {
                    return -1;
                }
                return buffer[pos++]; // Noncompliant, a signed byte value is returned
        }
    }

    private int getUnreachableValue() {
        return -1; // This value is unreachable as the switch condition in the read() method always evaluates to false
    }

    public int showBug() throws IOException {
        return this.read();
    }
}