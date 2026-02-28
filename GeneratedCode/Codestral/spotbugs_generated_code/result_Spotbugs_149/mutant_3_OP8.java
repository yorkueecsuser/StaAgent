import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    }

    public String mutatedCode(String fN) throws IOException { // Mutant code with a renamed variable
        FileInputStream inputStrm = new FileInputStream(new File(fN));
        StringBuilder res = new StringBuilder();
        byte dt;

        while ((dt = (byte) inputStrm.read())!= -1) {
            res.append((char) dt);
        }

        inputStrm.close();
        return res.toString();
    }
}