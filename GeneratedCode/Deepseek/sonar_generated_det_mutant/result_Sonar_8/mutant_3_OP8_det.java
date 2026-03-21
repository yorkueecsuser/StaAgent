import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int ujjenelh = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            }
            ujjenelh = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            ujjenelh = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return ujjenelh;
    }
}