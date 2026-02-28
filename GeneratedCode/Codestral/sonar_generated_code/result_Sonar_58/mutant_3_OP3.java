import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255};
    private int pos = 0;

    private boolean getUnreachableCondition() {
        return false;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        boolean unreachable = getUnreachableCondition();
        if (unreachable) {
            System.out.println("Unreachable code executed!"); // This line will never be executed
        }
        return buffer[pos++];
    }

    public int showBug() throws IOException {
        return this.read();
    }
}