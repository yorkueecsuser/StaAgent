import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
    public int showBug(byte[] data) {
        try {
            InputStream is = new ByteArrayInputStream(data);
            byte [] buffer = new byte[1000];
            is.read(buffer);  // Noncompliant: The value returned from a stream read should be checked
            return buffer[0];  // This may not be the expected value if the stream didn't fill the buffer
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}