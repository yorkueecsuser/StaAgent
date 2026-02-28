import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream qwe = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            qwe.read(buffer);  // Mutation: Renamed the variable 'is' to 'qwe'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}