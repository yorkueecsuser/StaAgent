import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { 
    private byte[] buffer;
    private int pos;
    private boolean neverReach;

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
        this.neverReach = false;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF; 
    }

    public int showBug() throws IOException {
        // Unreachable for loop
        for (int i = 0; neverReach; i++) {
            System.out.println("Unreachable loop");
        }

        return this.read();
    }
}