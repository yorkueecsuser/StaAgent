import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        int readData;
        do {
            readData = inputStream.read();
            data = (byte) readData;
            if (data!= -1) {
                result.append((char) data);
            }
        } while (readData!= -1); // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)

        inputStream.close();
        return result.toString();
    }
}