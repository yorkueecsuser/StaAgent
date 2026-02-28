import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);
            if (shouldRunUnreachableCode()) { // Added unreachable code
                int value = getFalseValue();
                switch (value) {
                    case 1:
                        System.out.println("This code will never be executed.");
                        break;
                }
            }
        }

        inputStream.close();
        return result.toString();
    }

    private boolean shouldRunUnreachableCode() {
        return false; // This method always returns false
    }

    private int getFalseValue() {
        return 0; // This method always returns a value that does not match the case statement
    }
}