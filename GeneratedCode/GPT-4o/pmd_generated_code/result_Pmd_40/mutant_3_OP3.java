import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here

            // Mutation: Unreachable if statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never print.");
            }
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    private boolean getFalseCondition() {
        // Returns false to ensure that the if statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}