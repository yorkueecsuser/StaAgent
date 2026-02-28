import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutation Operator: Dead Store
        // Inserting unused variable declaration with primitive type 'int'
        int unusedVariable = 10;

        // The resource 'fis' is not closed
    }
}