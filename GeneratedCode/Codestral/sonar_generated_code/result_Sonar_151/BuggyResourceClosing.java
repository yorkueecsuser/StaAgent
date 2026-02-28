import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BuggyResourceClosing {
    private String fileName;

    public BuggyResourceClosing(String fileName) {
        this.fileName = fileName;
    }

    public void showBug() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.readLine();
        // BUG: Resources should be closed
        // reader should be closed in a finally block or using try-with-resources
    }
}