import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int n = is.read(buffer); // Mutated code: Renaming the return value of is.read() to n
            if (n > 0) { // Mutated code: Making sure that n is positive before using it
                System.out.println("Read " + n + " bytes");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }
}