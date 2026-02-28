import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock

            // Introducing an unreachable if-else statement
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This is never executed.");
            } else {
                System.out.println("This is also never executed.");
            }
        }
        return "Finished without handling exception.";
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}