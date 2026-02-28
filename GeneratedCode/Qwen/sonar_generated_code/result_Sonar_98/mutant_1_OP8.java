import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {

    public byte[] showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            int a = is.read(buffer);  // BUG: The value returned from a stream read should be checked
            is.close();
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public long showBug2(String fileName, long bytesToSkip) {
        try {
            InputStream is = new FileInputStream(fileName);
            long b = is.skip(bytesToSkip);  // BUG: The value returned from a stream skip should be checked
            is.close();
            return b;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}