import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        boolean unreachableCondition = false;
        while ((data = (byte) inputStream.read())!= -1) {
            if (unreachableCondition) {
                System.out.println("This line should not be printed.");
            }
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    }
}