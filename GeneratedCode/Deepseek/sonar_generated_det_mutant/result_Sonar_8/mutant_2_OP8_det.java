import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int jitfwvdk = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            }
            jitfwvdk = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            jitfwvdk = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return jitfwvdk;
    }
}