import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int result = is.read(buffer);  // Mutated line: result is assigned the return value from is.read(buffer)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}