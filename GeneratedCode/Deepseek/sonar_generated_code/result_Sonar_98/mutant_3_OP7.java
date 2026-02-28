import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    private boolean conditionWhile = getCondition(); 

    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (conditionWhile) {
            // Mutant Code: Unreachable While Loop
        }
    }

    public void showBug() {
        doSomething("Test");
    }

    private boolean getCondition() {
        return false;
    }
}