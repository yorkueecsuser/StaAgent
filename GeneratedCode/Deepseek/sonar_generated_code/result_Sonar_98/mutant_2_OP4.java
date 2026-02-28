import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int read = is.read(buffer);  // BUG: The value returned from a stream read should be checked
            if (false) {
                System.out.println("This code will never be executed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}