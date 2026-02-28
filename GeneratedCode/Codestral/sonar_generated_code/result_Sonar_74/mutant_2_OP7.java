import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        boolean conditionWhile = false; // Mutation Operator: Unreachable while loop
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line is unreachable");
        }
        int data = fis.read();
        System.out.println("Data read from file: " + data);
        // The resource 'fis' is not closed here, but the mutant code has been added
    }
}