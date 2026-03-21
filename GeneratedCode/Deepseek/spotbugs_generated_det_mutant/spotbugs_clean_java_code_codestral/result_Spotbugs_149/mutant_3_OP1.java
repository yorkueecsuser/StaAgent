import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        // Mutation: Dead Store
        int unusedVariable;

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);

            // Using the dead store variable to avoid compiler warning
            unusedVariable = 0;
        }

        inputStream.close();
        return result.toString();
    }
}