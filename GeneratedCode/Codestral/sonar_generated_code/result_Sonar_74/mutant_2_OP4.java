import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code is unreachable, but it's added to demonstrate the mutation
            fis.close();
        } else {
            // This is the original code that should be executed
            // No resource leak here, as the FileInputStream 'fis' is already closed
            fis.close();
        }
    }
}