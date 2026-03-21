import java.io.IOException;
import java.util.Random;

class HttpStatusCodeBug {
public int showBug() {
    int statusCode = 0;
    statusCode = 0;
    try { if(new Random().nextBoolean()){ throw new IOException("An exception occurred"); } statusCode = 200; } catch(IOException e){ statusCode = 500; }
    return statusCode;
}
}