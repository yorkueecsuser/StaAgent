import java.io.FileInputStream;
import java.io.IOException;

class EndOfStreamBugDemo {

    public void showBug(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                // Convert int to byte, which can lead to the confusion between -1 and 0xFF
                byte data = (byte) byteData; 
                System.out.println("Read byte: " + data);
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