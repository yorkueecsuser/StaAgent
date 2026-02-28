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
    }
    
    // Unreachable switch statement
    public void mutantCode(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            is.read(buffer);  // Unreachable switch statement
            if (buffer[0] > 0) { // This is a mutant to avoid unreachable statement error
                switch (buffer[0]) {
                    default: // This is a dummy case to make the switch statement unreachable
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}