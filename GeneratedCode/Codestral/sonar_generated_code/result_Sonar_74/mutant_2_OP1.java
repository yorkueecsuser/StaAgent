import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Added code for Dead Store mutation operator
        int unusedVariable = 10;
        // End of added code

        // Bug is here, the resource 'fis' is not closed
    }
}