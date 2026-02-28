import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255}; // Array containing a signed byte and an unsigned byte
    private int pos = 0;

    @Override
    public int read() throws IOException {
        boolean switchCondition = getCondition();
        switch (switchCondition? 1 : 0) {
            case 1:
                break;
            default:
                if (pos == buffer.length) {
                    return -1;
                }
                return buffer[pos++]; // Noncompliant, a signed byte value is returned
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false making the switch statement unreachable.
    }

    public int showBug() throws IOException {
        return this.read();
    }
}