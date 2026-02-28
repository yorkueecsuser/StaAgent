import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { 
    private byte[] buffer;
    private int pos;

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF; 
    }

    // Unreachable switch statement mutation
    public boolean getCondition() {
        return false;
    }

    public int showBug() throws IOException {
        switch(0) {
            case 1:
                break;
            default:
                break;
        }
        return this.read();
    }
}