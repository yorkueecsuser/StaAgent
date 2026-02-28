import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        while ((data = (byte) inputStream.read())!= -1) {
            result.append((char) data);
        }

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable as the condition is always false
            // This is the mutant being added
            System.out.println("This line will never be executed");
        }

        inputStream.close();
        return result.toString();
    }
}