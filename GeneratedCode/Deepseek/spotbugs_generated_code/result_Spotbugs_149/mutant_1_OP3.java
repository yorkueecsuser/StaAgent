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

            // Inserted unreachable if branch
            if (getUnreachableCondition()) {
                System.out.println("This line will never be executed.");
            }
        }

        inputStream.close();
        return result.toString();
    }
}