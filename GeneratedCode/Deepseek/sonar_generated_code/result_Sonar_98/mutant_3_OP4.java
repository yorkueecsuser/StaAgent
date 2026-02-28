import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            boolean condition = false; // Mutant code
            if (condition) { // Mutant code
                // Mutant code: Unreachable if-else statement
                System.out.println("Unreachable code");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}