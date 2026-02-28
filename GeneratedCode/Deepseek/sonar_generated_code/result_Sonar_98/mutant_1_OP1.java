import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int unusedVariable = is.read(buffer);  // Mutant: Inserting an unused variable declaration of primitive type
            String randomString = "abcdefgh";  // Mutant: Inserting an unused variable declaration of String type
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}