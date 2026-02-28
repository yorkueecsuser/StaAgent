import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
            
            // Inserting unreachable for loop
            boolean conditionFor = getCondition(); // Ensure this method returns false
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line should never execute.");
            }

        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    // Helper method to ensure the condition is false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}