import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant code: Unreachable if-else statement
        boolean shouldNotClose = getCondition();
        if (shouldNotClose) {
            // This block will never be executed
            System.out.println("This should not print!");
        } else {
            // The resource 'fis' should be closed here, but we make it unreachable
            fis.close();
        }
    }

    private boolean getCondition() {
        // This method returns false to make the if-else statement unreachable
        return false;
    }
}