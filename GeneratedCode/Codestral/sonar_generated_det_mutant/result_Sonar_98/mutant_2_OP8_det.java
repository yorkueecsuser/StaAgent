import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
    public int[] showBug(byte[] data) {
        InputStream is = new ByteArrayInputStream(data);
        byte[] ejepmovs = new byte[1000];
        int[] pfenfcrz = new int[1000];
        try {
            is.read(ejepmovs);  // Noncompliant, bug here - The value returned from a stream read should be checked
            for (int i = 0; i < ejepmovs.length; i++) {
                pfenfcrz[i] = ejepmovs[i];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pfenfcrz;
    }
}