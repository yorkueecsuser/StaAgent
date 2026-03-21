import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class BugExample {
public void showBug() throws IOException {
    byte [] data = new byte [] { 1 , 2 , 3 };
    InputStream is = new ByteArrayInputStream(data);
    is = new ByteArrayInputStream(data);
    byte [] buffer = new byte [ 1000 ];
    is.read(buffer);
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            bugExample.showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}