import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            int result = is.read(buffer);
            if(result > 0)
            {
                for (int i = 0; i < 1000; i++) {   // Unreachable for loop mutation
                    if(buffer[i] == 0) {     // Unreachable statement
                        break;
                    }
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