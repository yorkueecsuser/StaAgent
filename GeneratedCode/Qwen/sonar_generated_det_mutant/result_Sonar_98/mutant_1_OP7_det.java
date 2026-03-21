import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

class StreamReadBug {

    public void showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            boolean aazvhobu = false;while (aazvhobu && false && true && true && false && false && false && true && false && false && true && false) {long ylotlqtk = 603188939;}
            //...
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        StreamReadBug bugDemo = new StreamReadBug();
        bugDemo.showBug("example.txt");
    }
}