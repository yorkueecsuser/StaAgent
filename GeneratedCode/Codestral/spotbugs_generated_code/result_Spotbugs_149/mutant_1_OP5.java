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

            // Unreachable switch statement
            boolean unreachableCondition = false;
            switch (unreachableCondition) {
                case true:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }

        inputStream.close();
        return result.toString();
    }

    // Helper method to avoid using compile-time constants directly
    private boolean getCondition() {
        return false;
    }
}