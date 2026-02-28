import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;
        int deadStore;   // Dead Store Mutation

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);
            deadStore = 0;   // Assigning a value to the dead store variable
        }

        inputStream.close();
        return result.toString();
    }
}