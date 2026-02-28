import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        int deadStoreVariable; // Added mutation: A dead store variable
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);
        // The resource 'fis' is not closed
    }
}