import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName); // Bug: Custom resources should be closed
        int data = fis.read();

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }

        System.out.println("Data read from file: " + data);
        // Bug is here, the resource 'fis' is not closed
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}