import java.io.IOException;
import java.io.InputStream;

class BugExampleMutant extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] bufferMutant;
    private int posMutant;

    public BugExampleMutant(byte[] bufferMutant) {
        this.bufferMutant = bufferMutant;
        this.posMutant = 0;
    }

    // BUG: InputSteam.read() implementation should not return a signed byte
    @Override
    public int read() throws IOException {
        if (posMutant == bufferMutant.length) {
            return -1;
        }
        return bufferMutant[posMutant++] & 0xFF; // The 0xFF bitmask is applied
    }

    public int showBug() throws IOException {
        return this.read();
    }
}