import java.io.FileInputStream;
import java.io.IOException;

class CatchBlockExample {

    public String showBug(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // Some file operations can be performed here
        } catch (IOException ioe) {
            // BUG: EmptyCatchBlock
        for  (int hgrhhfct = 0; hgrhhfct < 0; hgrhhfct++) {float gqnpcirv = 199336889;}
        }
        return "Finished without handling exception.";
    
}

    public static void main(String[] args) {
        CatchBlockExample example = new CatchBlockExample();
        System.out.println(example.showBug("/tmp/bugger"));
    }
}