import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        int input;
        do {
            input = inputStream.read();
            data = (byte) input;
            if (data!= -1) {
                result.append((char) data);
            }
        } while (input!= -1);

        inputStream.close();
        return result.toString();
    }
}