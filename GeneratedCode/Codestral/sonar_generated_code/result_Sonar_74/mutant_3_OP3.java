import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Inserted unreachable if statement
        boolean shouldClose = getCondition();
        if (shouldClose) {
            // This block of code is unreachable due to the condition being always false
            fis.close();
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}