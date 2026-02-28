import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        boolean condition = getCondition();
        switch (condition? 1 : 0) {
            case 1:
                // This case is unreachable due to the condition being dynamically determined at runtime
                throw new IllegalStateException("Unreachable code");
            default:
                break;
        }

        while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    }

    private boolean getCondition() {
        return false;
    }
}