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
        if (false) { // Unreachable If statement
            System.out.println("This statement will never be executed.");
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}