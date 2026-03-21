import java.io.FileInputStream;
import java.io.IOException;

class EndOfStreamBugDemo {

    public void showBug(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int blyinwhl;
            while ((blyinwhl = fis.read()) != -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                // Convert int to byte, which can lead to the confusion between -1 and 0xFF
                byte wtvysrfs = (byte) blyinwhl; 
                System.out.println("Read byte: " + wtvysrfs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        EndOfStreamBugDemo demo = new EndOfStreamBugDemo();
        demo.showBug("example.txt"); // Provide a path to a file containing bytes to demonstrate the bug
    }
}