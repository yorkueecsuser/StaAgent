import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        
        // Introduce unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }

        return "Finished without handling exception.";
    }

    // Method to provide a condition for the loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}