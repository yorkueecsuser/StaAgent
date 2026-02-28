import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant code: Duplicating the assignment statement
        int dataDuplicate = fis.read(); // Duplicated assignment statement

        // Bug is here, the resource 'fis' is not closed
    }
}