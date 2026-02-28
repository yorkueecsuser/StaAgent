import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();

        // Mutant code - Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because the condition is always false.
            System.out.println("This is an unreachable loop");
        }

        System.out.println("Data read from file: " + data);
        // Bug is here, the resource 'fis' is not closed
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable.
        return false;
    }
}