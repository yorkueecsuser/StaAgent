import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int pos;
    private boolean unreachableCondition = false; // added for the unreachable if statement mutation

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    // BUG: InputSteam.read() implementation should not return a signed byte
    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        if (unreachableCondition) { // Unreachable if statement mutation
            System.out.println("This statement should be unreachable");
        }
        return buffer[pos++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        return this.read();
    }
}