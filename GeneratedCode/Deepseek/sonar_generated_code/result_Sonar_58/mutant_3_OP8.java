import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int position; // Renamed variable "pos" to "position"

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.position = 0; // Update all occurrences of "pos" to "position"
    }

    // BUG: InputSteam.read() implementation should not return a signed byte
    @Override
    public int read() throws IOException {
        if (position == buffer.length) {
            return -1;
        }
        return buffer[position++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        return this.read();
    }
}