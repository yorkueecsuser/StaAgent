import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Original variable name
        int data = fis.read();
        System.out.println("Data read from file: " + data);
        // Bug is here, the resource 'fis' is not closed

        // Mutant: Renamed variable for 'fis'
        FileInputStream a = fis;
        // Close the mutant variable 'a'
        a.close();
    }
}