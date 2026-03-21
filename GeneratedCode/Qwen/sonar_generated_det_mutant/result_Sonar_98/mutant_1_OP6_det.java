import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

class StreamReadBug {

    public void showBug(String fileName) {
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            for  (int aflcgztc = 0; aflcgztc < 0; aflcgztc++) {double ruwwurao = -897752431;}
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