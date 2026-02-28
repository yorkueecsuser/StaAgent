import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
            
            // Unreachable if statement mutation
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
            
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    private boolean getUnreachableCondition() {
        return false; // This simulates the unreachable condition
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}