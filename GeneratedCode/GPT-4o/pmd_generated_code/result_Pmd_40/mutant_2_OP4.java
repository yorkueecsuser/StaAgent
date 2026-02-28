import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
            // Introducing an unreachable if-else statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            } else {
                System.out.println("This else branch is also unreachable.");
            }
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    // Method to simulate a condition that always returns false at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}