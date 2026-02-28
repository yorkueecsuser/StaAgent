import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    private boolean getUnreachableCondition() {
        return false;  // This method always returns false
    }

    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Adding the unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block of code is unreachable
            System.out.println("This line should never execute.");
        } else {
            // This block of code is the original code
            // No changes made here
        }

        // The resource 'fis' should be closed here to avoid resource leaks
    }
}