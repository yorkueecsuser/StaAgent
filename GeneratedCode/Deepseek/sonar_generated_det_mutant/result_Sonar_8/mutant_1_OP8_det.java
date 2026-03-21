import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int drcloubu = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            }
            drcloubu = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            drcloubu = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return drcloubu;
    }
}