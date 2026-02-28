import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        int zxqwnjgf = 0; // Dead Store: Unused variable declaration
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}