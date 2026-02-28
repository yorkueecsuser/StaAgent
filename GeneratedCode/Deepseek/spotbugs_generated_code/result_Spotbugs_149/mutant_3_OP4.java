import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        boolean condition = false;
        if (condition) { // Unreachable if-else branch: This condition is always false
            System.out.println("This branch should never be executed.");
        } else {
            while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                result.append((char) data);
            }
        }

        inputStream.close();
        return result.toString();
    }
}