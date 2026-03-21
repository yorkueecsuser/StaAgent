import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) { // Original bug: EOS_BAD_END_OF_STREAM_CHECK
            result.append((char) data);

            // Unreachable for loop based on the mutation operator information
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line is unreachable");
            }
        }

        inputStream.close();
        return result.toString();
    }
}