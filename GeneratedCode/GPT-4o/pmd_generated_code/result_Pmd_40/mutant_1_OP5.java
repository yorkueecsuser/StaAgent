import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here

            // Introduce an unreachable switch statement
            int switchValue = getUnreachableValue();
            switch (switchValue) {
                case 1:
                    System.out.println("This case is not reachable.");
                    break;
                default:
                    System.out.println("Default case is not reachable.");
            }

        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    // Method to provide a non-final switch value that makes the switch unreachable
    private int getUnreachableValue() {
        return 0; // Always returns 0, making case 1 unreachable
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}