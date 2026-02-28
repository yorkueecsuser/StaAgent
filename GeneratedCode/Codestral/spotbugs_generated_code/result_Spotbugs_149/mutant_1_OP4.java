import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);

            // Mutated code: Unreachable if-else statement
            boolean unreachableCondition = (data == 0xFF);
            if (unreachableCondition) {
                // This branch is unreachable because the condition is only true when data is 0xFF, but we convert data to byte before comparing it to -1, so it cannot be 0xFF
                // The following code is dead code
                System.out.println("This line should never be executed.");
            } else {
                // This branch is also unreachable because the condition of the if statement is always false
                // The following code is dead code
                System.out.println("This line should also never be executed.");
            }
        }

        inputStream.close();
        return result.toString();
    }

    // A helper method for the unreachable if-else statement mutation operator
    private boolean getCondition() {
        return false;
    }
}