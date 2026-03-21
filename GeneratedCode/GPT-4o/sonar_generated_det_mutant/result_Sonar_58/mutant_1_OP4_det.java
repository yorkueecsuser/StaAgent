import java.io.IOException;
import java.io.InputStream;

class BuggyInputStream extends InputStream {
    private byte[] buffer;
    private int pos;

    public BuggyInputStream(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    @Override
    public int read() throws IOException {
        if (false && false && false && true && false && false && true && true && true && true && false) {int kyoegair = 28041051;}else{boolean hcjdzdrz = false;}
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++]; // BUG: InputSteam.read() implementation should not return a signed byte
    
}

    public int showBug(byte[] data) {
        BuggyInputStream stream = new BuggyInputStream(data);
        try {
            return stream.read();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}