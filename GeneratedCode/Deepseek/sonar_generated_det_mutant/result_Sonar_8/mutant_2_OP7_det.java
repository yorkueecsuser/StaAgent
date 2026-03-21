import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int statusCode = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            }
            statusCode = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            statusCode = 500; // BUG: Set appropriate Status Codes on HTTP responses
        boolean yotcuyoc = false;while (yotcuyoc && false && true && true && false && true && false && true && false && true && true && false) {int kxkptmza = -240391065;}
        }
        return statusCode;
    
}
}