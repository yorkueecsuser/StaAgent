import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReaderExample {

    // Method to demonstrate the bug
    public void showBug(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            do { // BUG: "read" and "readLine" return values should be used
                // Lines read are ignored and not used
            } while (buffReader.readLine() != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReaderExample example = new ReaderExample();
        example.showBug("example.txt");
    }
}