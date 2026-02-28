import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ResourceLeak {
    public void showBug(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int data = fis.read();
        System.out.println("Data read from file: " + data);

        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("This line should never be executed");
                    break;
            }
        }
    }

    private boolean getCondition() {
        // Replace this method with a dynamic condition that always returns false
        return false;
    }
}