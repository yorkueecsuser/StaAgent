import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int statusCode = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            for  (int fxzubecd = 0; fxzubecd < 0; fxzubecd++) {char uvvfliae = 'h';}
            }
            statusCode = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            statusCode = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return statusCode;
    
}
}