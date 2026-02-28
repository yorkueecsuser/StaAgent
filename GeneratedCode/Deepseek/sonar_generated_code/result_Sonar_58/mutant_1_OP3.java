import java.io.IOException;
import java.io.InputStream;

class MutantExample extends InputStream {
    private byte[] buffer;
    private int pos;
    private boolean alwaysFalse = false; // Always false variable to avoid unreachable statement

    public MutantExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    // Mutated code
    @Override
    public int read() throws IOException {
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF;
    }

    public int showMutant() throws IOException {
        if (alwaysFalse) { // Unreachable if branch
            System.out.println("This branch should be unreachable");
        }
        return this.read();
    }
}