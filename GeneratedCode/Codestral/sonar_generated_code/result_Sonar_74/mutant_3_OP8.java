import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        FileInputStream a = fis; // Renaming the variable 'fis' to 'a'
        int data = a.read();
        System.out.println("Data read from file: " + data);
        // Bug is here, the resource 'a' is not closed
    }
}