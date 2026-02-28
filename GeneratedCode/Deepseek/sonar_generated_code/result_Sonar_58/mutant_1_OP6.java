import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int pos;

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
        return buffer[pos++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        for (int i = 0; false; i++) {
            // This for loop is unreachable by design
            System.out.println("This code is unreachable and will never be executed");
        }
        return this.read();
    }
}