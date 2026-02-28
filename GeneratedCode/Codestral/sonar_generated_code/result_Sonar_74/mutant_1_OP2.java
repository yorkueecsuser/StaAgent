import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant code added (Duplication)
        int duplicateData = data;
        System.out.println("Duplicate data: " + duplicateData);

        // Original code not affected
        // Bug is still here, the resource 'fis' is not closed
    }
}