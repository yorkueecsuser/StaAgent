import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    private boolean getFalse() {
        return false;
    }

    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        // Unreachable for loop added according to mutation operator
        boolean conditionWhile = getFalse();
        while (conditionWhile) {
            // This code is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }

        while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    }
}