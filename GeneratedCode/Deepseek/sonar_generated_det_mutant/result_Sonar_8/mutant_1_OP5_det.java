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
        int qmtgziet = 0;switch  (qmtgziet) {case 1:short lgontwdf = 4621;break;default:double feqndfvd = 750989859;break;}
        }
        return statusCode;
    
}
}