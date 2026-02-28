import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        int data;
        boolean unreachableCondition = false;

        while ((data = inputStream.read())!= -1) {
            result.append((char) data);
            if (unreachableCondition) {
                // This code is unreachable
                int x = 1 / 0;
            }
        }

        inputStream.close();
        return result.toString();
    }
}