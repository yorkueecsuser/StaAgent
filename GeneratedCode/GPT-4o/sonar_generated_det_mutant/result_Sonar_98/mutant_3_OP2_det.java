import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBugDemo {

    public byte[] showBug(String fileName) {
        byte[] buffer = new byte[1000];
        try {
            InputStream is = new FileInputStream(fileName);
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            // Additional processing could be done here
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
public static void main(String [] args){
    StreamReadBugDemo demo = new StreamReadBugDemo();
    byte [] result = demo.showBug("example.txt");
    result = demo.showBug("example.txt");
}
}