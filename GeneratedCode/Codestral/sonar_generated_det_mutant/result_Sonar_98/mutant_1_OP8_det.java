import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
    public int[] showBug(byte[] data) {
        InputStream is = new ByteArrayInputStream(data);
        byte[] ymnubukp = new byte[1000];
        int[] xyaikywd = new int[1000];
        try {
            is.read(ymnubukp);  // Noncompliant, bug here - The value returned from a stream read should be checked
            for (int i = 0; i < ymnubukp.length; i++) {
                xyaikywd[i] = ymnubukp[i];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xyaikywd;
    }
}