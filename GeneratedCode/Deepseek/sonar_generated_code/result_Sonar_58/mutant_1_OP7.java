import java.io.IOException;
import java.io.InputStream;

class BugExampleMutant1 extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int pos;
    private boolean condition;

    public BugExampleMutant1(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
        this.condition = false;
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
        while (condition) {
            // Do nothing inside this unreachable while loop
        }
        return this.read();
    }
}