import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] a; // Renamed buffer
    private int pos;

    public BugExample(byte[] a) { // Renamed buffer
        this.a = a;
        this.pos = 0;
    }

    // BUG: InputSteam.read() implementation should not return a signed byte
    @Override
    public int read() throws IOException {
        if (pos == a.length) { // Renamed buffer
            return -1;
        }
        return a[pos++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        return this.read();
    }
}