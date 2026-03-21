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
        if (false && false && true && false && true && true && false && true && false && false && false) {short voawahwz = -1752;}else{float psgtimzq = -740926455;}
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++]; // BUG: InputSteam.read() implementation should not return a signed byte
    
}

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        InputStream stream = new BuggyInputStream(buffer);
        while (stream.read()!= -1) {
            System.out.println("Read byte: " + stream.read());
        }
    }
}