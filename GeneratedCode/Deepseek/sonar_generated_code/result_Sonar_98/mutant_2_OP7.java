import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Adding an unreachable while loop
        boolean condition = false;
        while (condition) {
            // Do nothing, this loop is unreachable
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}