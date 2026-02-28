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
        return "Finished without handling exception.";
    }

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }

    // Mutant code
    public String showBugMutant(String a) {
        try {
            FileInputStream b = new FileInputStream(a);
            // Some file operations can be performed here
        } catch (IOException c) {
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }
}