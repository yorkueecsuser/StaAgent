import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) fileInputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);
        }

        fileInputStream.close();
        return result.toString();
    }
}