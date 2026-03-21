import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
    public int[] showBug(byte[] data) {
        InputStream is = new ByteArrayInputStream(data);
        byte[] buffer = new byte[1000];
        int[] result = new int[1000];
        try {
            is.read(buffer);  // Noncompliant, bug here - The value returned from a stream read should be checked
            { int i = 0; do { result[i] = buffer[i]; i++; } while (i < buffer.length); }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}