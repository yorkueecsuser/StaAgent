import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) { // Original buggy line
            data = (byte) inputStream.read(); // Duplicated buggy line
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    }
}