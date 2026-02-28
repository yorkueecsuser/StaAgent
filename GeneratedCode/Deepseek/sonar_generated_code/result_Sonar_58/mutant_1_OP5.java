import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream {
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
        return buffer[pos++] & 0xFF;
    }

    public int showBug() throws IOException {
        return this.read();
    }

    public void unreachableSwitchMutant() {
        boolean isTrue = true;
        int value = 1;

        switch (value) {
            case 0:
                isTrue = false;
                break;
            case 1:
                isTrue = true;
                break;
            default:
                boolean isFalse = false;
                switch (value) {
                    case 0:
                        isFalse = true;
                        break;
                    case 1:
                        isFalse = false;
                        break;
                    default:
                        break;
                }
        }
    }
}