import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReaderExample {

    public void showBug(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine() != null) { // BUG: "read" and "readLine" return values should be used
                // The line read is not being used, which is the bug
                // Further processing should be done here with the read line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}