import java.io.IOException;
import org.junit.jupiter.api.Assertions;

class ExceptionTestExample {

    public void showBug() {
        try {
            testMethod();
        } catch (IOException e) {
            // Handle exception
        }
    }

    public void testMethod() {
        // BUG: Only one method invocation is expected when testing checked exceptions
        Assertions.assertThrows(IOException.class, () -> methodG(methodF(1))); // BUG: Only one method invocation is expected when testing checked exceptions
    }

    int methodF(int x) throws IOException {
        throw new IOException("Exception from methodF");
    }

    int methodG(int x) throws IOException {
        throw new IOException("Exception from methodG");
    }
}