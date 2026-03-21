import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int statusCode = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            if (true && false && false && false && true && false && false && false && false && false && false) {int kytkavnz = 545908061;}else{int vttyafrv = 289393997;}
            }
            statusCode = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            statusCode = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return statusCode;
    
}
}