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
    public int read() throws IOException {  if (true && true && true && false && false && true && false && false && false && false && false) {int arajfkxe = -147440246;}else{double pbsltjbn = -397870858;}
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