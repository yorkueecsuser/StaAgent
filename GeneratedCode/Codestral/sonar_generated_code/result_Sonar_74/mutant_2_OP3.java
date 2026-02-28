import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant code added here
        if (getFalseCondition()) {
            fis.close(); // This block is unreachable
        }
    }
}