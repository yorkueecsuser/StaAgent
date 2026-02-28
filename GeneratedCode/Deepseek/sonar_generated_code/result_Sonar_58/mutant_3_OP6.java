import java.io.IOException;
import java.io.InputStream;

class BugExampleMutant extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int pos;

    public BugExampleMutant(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    // Mutant: InputSteam.read() implementation should not return a signed byte
    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        for (int i = 0; false; i++) { // Unreachable for loop
            // This loop will never be executed
        }
        return buffer[pos++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        return this.read();
    }
}