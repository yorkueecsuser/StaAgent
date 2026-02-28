import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Inserted unreachable switch statement
        boolean isFalse = getCondition();
        if (!isFalse) {
            int value = 0;
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable case");
                    break;
            }
        }

        // The resource 'fis' is not closed
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }
}