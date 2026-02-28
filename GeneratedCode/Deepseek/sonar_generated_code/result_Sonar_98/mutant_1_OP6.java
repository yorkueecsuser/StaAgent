import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int read = is.read(buffer);
            boolean condition = getCondition();
            while (condition) {
                System.out.println("Unreachable Loop");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }

    private boolean getCondition() {
        return false;
    }
}