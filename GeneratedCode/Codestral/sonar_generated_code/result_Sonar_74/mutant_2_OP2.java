import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant: Duplicate the line where the data is read from the FileInputStream
        int data2 = fis.read();
        System.out.println("Duplicate data read from file: " + data2);

        // The resource 'fis' is not closed
    }
}