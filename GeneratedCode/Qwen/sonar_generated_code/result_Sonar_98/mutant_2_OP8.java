import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {

    public byte[] showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            is.close();
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Mutated code for showBug method
    public byte[] showBug(String x) {
        try {
            InputStream q = new FileInputStream(x);
            byte[] z = new byte[1000];
            q.read(z);  // BUG: The value returned from a stream read should be checked
            q.close();
            return z;
        } catch (IOException w) {
            w.printStackTrace();
            return null;
        }
    }

    public long showBug2(String fileName, long bytesToSkip) {
        try {
            InputStream is = new FileInputStream(fileName);
            long skippedBytes = is.skip(bytesToSkip);  // BUG: The value returned from a stream skip should be checked
            is.close();
            return skippedBytes;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Mutated code for showBug2 method
    public long showBug2(String y, long v) {
        try {
            InputStream t = new FileInputStream(y);
            long u = t.skip(v);  // BUG: The value returned from a stream skip should be checked
            t.close();
            return u;
        } catch (IOException s) {
            s.printStackTrace();
            return -1;
        }
    }
}