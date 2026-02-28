import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
            
            // Adding unreachable if statement
            boolean isUnreachable = getUnreachableCondition();
            if (isUnreachable) {
                System.out.println("This block is unreachable.");
            }

        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    private boolean getUnreachableCondition() {
        return false; // This simulates a condition that is always false
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}