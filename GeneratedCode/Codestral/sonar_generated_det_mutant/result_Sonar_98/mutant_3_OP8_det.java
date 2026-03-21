import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
    public int[] showBug(byte[] data) {
        InputStream is = new ByteArrayInputStream(data);
        byte[] nzuxwvrt = new byte[1000];
        int[] yhkxjqzv = new int[1000];
        try {
            is.read(nzuxwvrt);  // Noncompliant, bug here - The value returned from a stream read should be checked
            for (int i = 0; i < nzuxwvrt.length; i++) {
                yhkxjqzv[i] = nzuxwvrt[i];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return yhkxjqzv;
    }
}