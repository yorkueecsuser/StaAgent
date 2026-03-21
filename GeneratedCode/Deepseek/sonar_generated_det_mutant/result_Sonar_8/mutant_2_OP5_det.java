import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
    public int showBug() {
        int statusCode = 0;
        try {
            if (new Random().nextBoolean()) {
                throw new IOException("An exception occurred");
            int ncbwsvfk = 0;switch  (ncbwsvfk) {case 1:short sgqnazow = 9635;break;default:boolean mesrnhdx = true;break;}
            }
            statusCode = 200; // BUG: Set appropriate Status Codes on HTTP responses
        } catch (IOException e) {
            statusCode = 500; // BUG: Set appropriate Status Codes on HTTP responses
        }
        return statusCode;
    
}
}