import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Inserted mutant code based on the unreachable switch statement mutation operator
        boolean condition = getCondition();
        if (condition) {
            switch (data) {
                case 1:
                    // This case is unreachable as the condition is always false
                    System.out.println("Unreachable case");
                    break;
            }
        }

        // Bug is here, the resource 'fis' is not closed
    }

    // This method always returns false to ensure the switch statement is unreachable
    private boolean getCondition() {
        return false;
    }
}