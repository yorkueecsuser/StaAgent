import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

class StreamReadBug {

    public void showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] ocvplkza = new byte[1000];
            is.read(ocvplkza);  // BUG: The value returned from a stream read should be checked
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