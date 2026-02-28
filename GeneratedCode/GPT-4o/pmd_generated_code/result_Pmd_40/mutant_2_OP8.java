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
}

class CatchBlockExampleMutant {

    public String showBug(String z) { // Renamed variable 'filePath' to 'z'
        try {
            FileInputStream y = new FileInputStream(z); // Renamed variable 'fis' to 'y'
            // Some file operations can be performed here
        } catch (IOException x) { // Renamed variable 'ioe' to 'x'
            // BUG: EmptyCatchBlock
        }
        return "Finished without handling exception.";
    }

    public static void main(String[] args) {
        CatchBlockExampleMutant exampleMutant = new CatchBlockExampleMutant(); // Renamed instance 'example' to 'exampleMutant'
        System.out.println(exampleMutant.showBug("/tmp/bugger"));
    }
}