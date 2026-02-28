import java.io.IOException;
import java.io.InputStream;

class BugExampleMutant extends InputStream {
    private byte[] buffer;
    private int pos;
    private boolean isMutant;

    public BugExampleMutant(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
        this.isMutant = true;
    }

    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF;
    }

    public int showBugMutant() throws IOException {
        while(isMutant) {
            System.out.println("This is unreachable code");
        }
        return this.read();
    }
}