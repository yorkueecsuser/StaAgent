import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private final byte[] buffer = {(byte)128, (byte)255};
    private int pos = 0;

    @Override
    public int read() throws IOException {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Mutant: Unreachable while loop
            // This loop will never be executed because the condition is always false
        }
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++];
    }

    public int showBug() throws IOException {
        return this.read();
    }

    private boolean getCondition() {
        return false; // The condition always returns false
    }
}