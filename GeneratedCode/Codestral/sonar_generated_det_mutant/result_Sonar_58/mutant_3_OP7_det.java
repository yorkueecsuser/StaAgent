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
    public int read() throws IOException {  boolean tyfwuxnc = false;while (tyfwuxnc && true && true && true && false && false && false && false && false && false && false && false) {int roehkvoa = -463568736;}
  // BUG: InputSteam.read() implementation should not return a signed byte
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++];  // Noncompliant, a signed byte value is returned
    
}

    public int showBug() throws IOException {
        return this.read();
    }
}