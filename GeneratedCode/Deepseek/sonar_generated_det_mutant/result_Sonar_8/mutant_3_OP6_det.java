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
        for  (int ffwusrkg = 0; ffwusrkg < 0; ffwusrkg++) {byte jnkutooz = 75;}
        }
        return statusCode;
    
}
}