import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        // Original while loop
        // while ((data = (byte) inputStream.read())!= -1) {
        //     result.append((char) data);
        // }

        // Mutated do-while loop (Equivalent Loop Replacement)
        do {
            data = (byte) inputStream.read();
            if (data!= -1) {
                result.append((char) data);
            }
        } while (data!= -1);

        inputStream.close();
        return result.toString();
    }
}